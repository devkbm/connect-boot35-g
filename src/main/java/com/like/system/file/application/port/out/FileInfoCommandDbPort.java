package com.like.system.file.application.port.out;

import java.util.List;

import org.jmolecules.architecture.hexagonal.SecondaryPort;

import com.like.system.file.domain.FileInfo;

@SecondaryPort
public interface FileInfoCommandDbPort {
	FileInfo getFileInfo(String id);
	
	List<FileInfo> getFileInfo(List<String> ids);
	
	FileInfo save(FileInfo entity);
	
	List<FileInfo> save(List<FileInfo> entities);
	
	void delete(String id);
}
