package com.like.system.webresource.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.like.core.jpa.domain.AbstractAuditEntity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "comresource")
@EntityListeners(AuditingEntityListener.class)
public class WebResource extends AbstractAuditEntity implements Serializable{	
	
	private static final long serialVersionUID = 4402275274864737663L;

	@Id
	@Comment("리소스ID")
	@Column(name="RESOURCE_ID")
	String id;
	
	@Comment("리소스명")
	@Column(name="RESOURCE_NAME")
	String name; 
		
	@Comment("리소스분류")
	@Column(name="RESOURCE_TYPE")
	String type; 
		
	@Column(name="URL")
	String url;
	
	@Comment("설명")
	@Column(name="DESCRIPTION")
	String description;	
		
	@Builder
	public WebResource(
			String appUrl,
			String resourceId,
			String resourceName,
			String resourceType,
			String url,
			String description) {		
		this.setAppUrl(appUrl);
		this.id = resourceId;
		this.name = resourceName;
		this.type = resourceType;
		this.url = url;
		this.description = description;
	}	
		
	@Builder(builderMethodName = "modifyBuilder", buildMethodName = "modify")
	public void modify(
			String appUrl,
			String resourceName,
			String resourceType,
			String url,
			String description) {
		this.setAppUrl(appUrl);
		this.name = resourceName;
		this.type = resourceType;
		this.url = url;
		this.description = description;
	}
		
}
