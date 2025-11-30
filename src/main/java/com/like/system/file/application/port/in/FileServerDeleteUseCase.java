package com.like.system.file.application.port.in;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

@PrimaryPort
public interface FileServerDeleteUseCase {
	void delete(String fileInfoId);
}
