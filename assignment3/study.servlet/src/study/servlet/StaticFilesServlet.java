package study.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import study.util.Utils;

@Component
@HttpWhiteboardServletPattern("/static/*")
public class StaticFilesServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	private static final File RESOURCES_DIR = new File("resources");
	private static final Map<String, String> FILE_EXT_TO_CONTENT_TYPE;
	static {
		FILE_EXT_TO_CONTENT_TYPE = new HashMap<>();
		FILE_EXT_TO_CONTENT_TYPE.put("css", "text/css");
		FILE_EXT_TO_CONTENT_TYPE.put("js", "text/javascript");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestPath = request.getRequestURI();

		File staticFile = new File(RESOURCES_DIR + requestPath);
		if (!staticFile.exists()) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND, "Could not find the file " + requestPath);
			return;
		}

		serveStaticFile(staticFile, response);
	}

	private void serveStaticFile(File htmlFile, HttpServletResponse response) throws IOException {
		String fileExt = Utils.getFileExt(htmlFile);
		response.setContentType(FILE_EXT_TO_CONTENT_TYPE.getOrDefault(fileExt, "text/plain"));
		PrintWriter writer = response.getWriter();
		String fileContents = String.join("\n", Files.readAllLines(htmlFile.toPath()));
		writer.write(fileContents);
	}
}