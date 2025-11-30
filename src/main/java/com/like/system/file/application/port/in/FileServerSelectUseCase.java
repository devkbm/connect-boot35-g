package com.like.system.file.application.port.in;

import java.util.List;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

import com.like.system.file.domain.FileInfo;

@PrimaryPort
public interface FileServerSelectUseCase {

	FileInfo select(String id);
	
	List<FileInfo> select(List<String> ids);
}
