package com.like.system.file.domain;

import java.io.File;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.like.core.jpa.domain.AbstractAuditEntity;


import io.hypersistence.utils.hibernate.id.Tsid;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonAutoDetect
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "comfileinfo")
@EntityListeners(AuditingEntityListener.class)
public class FileInfo extends AbstractAuditEntity implements Serializable {
			
	private static final long serialVersionUID = 4108977246168878308L;

	@Id
	@Tsid
	@Column(name="FILE_ID")
	Long id;

	@Column(name="APP_URL")
	String appUrl;
		
	@Column(name="USER_ID")
	String userId;
	
	@Column(name="CONTENT_TYPE")
	String contentType;
		
	@Column(name="UUID")
	String uuid;
	
	@Column(name="FILE_PATH")
	String path;
	
	@Column(name="FILE_NM")
	String fileName;
	
	@Column(name="FILE_SIZE")
	long size;
	
	@Column(name="DOWNLOAD_CNT")
	long downloadCount;			
		
	@Builder
	public FileInfo(String appUrl, String userId, String contentType, /*String uuid,*/ String path, String fileName, long size) {		
		//this.id = FileIdGenerator.generateSequencialUUID();	
		this.appUrl = appUrl;
		this.userId = userId;
		this.contentType = contentType;
		this.uuid = FileIdGenerator.generateSequencialUUID().toString();
		this.path = path;
		this.fileName = fileName;
		this.size = size;
	}
	
	public static FileInfo create(MultipartFile sourceFile, String uploadPath, /*String uuid,*/ String userId, String appUrl) {
		
		return FileInfo.builder()
					   //.uuid(uuid)
				       .path(uploadPath)
				       .fileName(sourceFile.getOriginalFilename())
				       .size(sourceFile.getSize())
				       .contentType(sourceFile.getContentType())
				       .userId(userId)
				       .appUrl(appUrl)
				       .build();
	}
		
	public void plusDownloadCount() {
		this.downloadCount = this.downloadCount + 1;
	}
	
	public File getFile() {
		return new File(this.path, this.uuid);
	}

}
