package com.like.system.file.application.port.out;

import org.jmolecules.architecture.hexagonal.SecondaryPort;

import jakarta.servlet.http.HttpServletResponse;

@SecondaryPort
public interface FileDownloadWebPort {
	HttpServletResponse setResponse(HttpServletResponse response, long fileSize, String fileName, String mimeType);
	
	HttpServletResponse setImageResponse(HttpServletResponse response, long fileSize, String contentType);
}
