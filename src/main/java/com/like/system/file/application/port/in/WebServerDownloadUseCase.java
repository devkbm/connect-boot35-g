package com.like.system.file.application.port.in;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

import jakarta.servlet.http.HttpServletResponse;

@PrimaryPort
public interface WebServerDownloadUseCase {
	void downloadWebStaticPath(String uploadFileName, String downloadFileName, HttpServletResponse response);
}
