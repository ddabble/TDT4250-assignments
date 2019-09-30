package conversion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import conversion.api.Unit;
import conversion.api.UnitConversionHandler;
import conversion.api.UnitConversionResult;
import conversion.api.UnitConverterInterface;

@Component
@HttpWhiteboardServletPattern("/convert/*")
public class ConversionServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	private static final String VALUE_PARAM = "v";
	private static final String FROM_PARAM = "from";
	private static final String TO_PARAM = "to";

	private UnitConversionHandler conversionHandler = new UnitConversionHandler();

	@Reference(
			cardinality = ReferenceCardinality.MULTIPLE,
			policy = ReferencePolicy.DYNAMIC,
			bind = "addConverter",
			unbind = "removeConverter")
	public void addConverter(UnitConverterInterface converter) {
		conversionHandler.addUnitConverter(converter);
	}

	public void removeConverter(UnitConverterInterface converter) {
		conversionHandler.removeUnitConverter(converter);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> parameterMap = request.getParameterMap();
		if (!parameterMap.containsKey(VALUE_PARAM)
				|| !parameterMap.containsKey(FROM_PARAM)
				|| !parameterMap.containsKey(TO_PARAM)) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST,
					"Request must contain all three parameters: "
							+ VALUE_PARAM + ", " + FROM_PARAM + " and " + TO_PARAM);
			return;
		}

		double value = Double.parseDouble(request.getParameter(VALUE_PARAM));
		Unit fromUnit = parseUnitSymbol(request.getParameter(FROM_PARAM), response);
		Unit toUnit = parseUnitSymbol(request.getParameter(TO_PARAM), response);
		if (fromUnit == null || toUnit == null)
			return;

		UnitConversionResult result = conversionHandler.convert(fromUnit, toUnit, value);
		sendResponse(result, response);
	}

	private Unit parseUnitSymbol(String unitParam, HttpServletResponse response) throws IOException {
		unitParam = unitParam.trim();
		if (unitParam.length() != 1) {
			throw new IllegalArgumentException(
					"Cannot convert a unit with a symbol of more than one character: '" + unitParam + "'");
		}

		char unitSymbol = unitParam.charAt(0);
		Unit unit = conversionHandler.getUnitBySymbol(unitSymbol);
		if (unit == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,
					"No registered unit converter for the unit symbol " + unitSymbol);
		}
		return unit;
	}

	private static void sendResponse(UnitConversionResult result, HttpServletResponse response)
			throws ServletException, IOException {
		if (!result.success) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,
					"Could not convert between " + result.fromUnit.getName() + " and " + result.toUnit.getName());
		}

		response.setContentType("text/plain");
		PrintWriter writer = response.getWriter();
		writer.println("--- Conversion from " + result.fromUnit.getName() + " to " + result.toUnit.getName() + " ---");
		writer.println(result.value + " " + result.fromUnit + " = " + result.result + " " + result.toUnit);
	}
}
