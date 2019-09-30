package conversion.temperature;

import org.osgi.service.component.annotations.Component;

import conversion.api.Unit;
import conversion.api.UnitConversionResult;
import conversion.api.UnitConverterInterface;
import conversion.temperature.unit.Celsius;
import conversion.temperature.unit.Fahrenheit;
import conversion.util.UnitConverterComponent;

@Component(
		property = { UnitConverterComponent.CONVERTER_NAME_PROP + "=temp" })
public class TemperatureConverter extends UnitConverterComponent implements UnitConverterInterface {
	public TemperatureConverter() {
		super(new Unit[] { new Celsius(), new Fahrenheit() });
	}

	@Override
	public String getName() {
		return "Temperature";
	}

	@Override
	public UnitConversionResult convert(double value, Unit fromUnit, Unit toUnit) {
		if (!isUnitCombinationValid(fromUnit, toUnit))
			return null;

		double result;
		if (fromUnit instanceof Celsius)
			result = value * 9 / 5 + 32;
		else if (fromUnit instanceof Fahrenheit)
			result = (value - 32) * 5 / 9;
		else
			return null; // should never reach this, because of the `isUnitCombinationValid()` check

		return new UnitConversionResult(value, fromUnit, result, toUnit, true);
	}
}
