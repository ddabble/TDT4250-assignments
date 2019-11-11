package study.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import study.util.Utils;

@Component
@HttpWhiteboardServletPattern("/*")
public class StudyServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	private static final File RESOURCES_DIR = new File("resources");

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, File> htmlFiles = findHtmlFiles();

		String requestPath = request.getRequestURI();
		// Remove leading /
		requestPath = requestPath.substring(1);
		if (requestPath.isEmpty()) {
			serveIndexPage(htmlFiles, response);
			return;
		}

		File htmlFile = htmlFiles.get(requestPath.toLowerCase());
		if (htmlFile == null) {
			response.sendError(HttpServletResponse.SC_NOT_FOUND,
					"Could not find the file " + requestPathToFilePath(requestPath));
			return;
		}

		serveHtmlFile(htmlFile, response);
	}

	private void serveIndexPage(Map<String, File> htmlFiles, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("<!DOCTYPE html><html lang=\"en\">"
				+ "<head><meta charset=\"UTF-8\" /><title>Found HTML files</title></head>" + "<body>");

		writer.write("<h1>Found HTML files:</h1><ul>");
		for (Entry<String, File> entry : htmlFiles.entrySet()) {
			writer.write("<li><a href=\"/" + entry.getKey() + "\">" + entry.getValue().getName() + "</a></li>");
		}
		writer.write("</ul>" + "</body></html>");
	}

	private void serveHtmlFile(File htmlFile, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String html = String.join("\n", Files.readAllLines(htmlFile.toPath()));
		writer.write(html);
	}

	private static Map<String, File> findHtmlFiles() {
		Map<String, File> foundHtmlFiles = new HashMap<>();

		for (File file : RESOURCES_DIR.listFiles()) {
			String fileName_noExt = Utils.getFileNameWithoutExt(file);
			String fileExt = Utils.getFileExt(file);
			if (fileExt.isEmpty())
				continue;

			if (fileExt.equalsIgnoreCase("html"))
				foundHtmlFiles.put(fileName_noExt.toLowerCase(), file);
		}

		return foundHtmlFiles;
	}

	private static String requestPathToFilePath(String requestPath) {
		return RESOURCES_DIR.getAbsolutePath() + "\\" + requestPath + ".html";
	}
}