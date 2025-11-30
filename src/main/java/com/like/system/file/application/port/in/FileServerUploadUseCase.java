package com.like.system.file.application.port.in;

import java.util.List;

import org.jmolecules.architecture.hexagonal.PrimaryPort;
import org.springframework.web.multipart.MultipartFile;

import com.like.system.file.domain.FileInfo;

@PrimaryPort
public interface FileServerUploadUseCase {

	FileInfo uploadFile(MultipartFile sourceFile, String userId, String pgmId);
	
	List<FileInfo> uploadFile(List<MultipartFile> sourceFiles, String userId, String pgmId);
}
