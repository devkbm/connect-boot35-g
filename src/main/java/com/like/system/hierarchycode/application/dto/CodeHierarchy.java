package com.like.system.hierarchycode.application.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.querydsl.core.annotations.QueryProjection;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	
@NoArgsConstructor(access = AccessLevel.PROTECTED)	
public class CodeHierarchy implements Serializable {	
		
	private static final long serialVersionUID = -6718790962885573030L;

	String id;
	
	String systemTypeCode;
	
	String parentId;
				
	String code;
	
	String codeName;
	
	String codeNameAbbreviation;					
	
	LocalDateTime fromDate;
	
	LocalDateTime toDate;			
	
	int seq;
			
	String cmt;
	
	List<CodeHierarchy> children = new ArrayList<>();
	
	
	/**
	* NzTreeNode property 
	*/
	String title;
	
	String key;
		
	@JsonProperty(value="isLeaf") 
	boolean isLeaf;
	
	@QueryProjection
	public CodeHierarchy(String codeId
						,String systemTypeCode
						,String code
						,String codeName
						,String codeNameAbbreviation
						,String parentId
						,LocalDateTime fromDate
						,LocalDateTime toDate
						,int seq
						,String cmt) {	
	this.id = codeId;
	this.systemTypeCode = systemTypeCode;
	this.parentId = parentId;
	this.code = code;
	this.codeName = codeName;
	this.codeNameAbbreviation = codeNameAbbreviation;
	this.fromDate = fromDate;
	this.toDate = toDate;
	this.seq = seq;
	this.cmt = cmt;
	
	this.title 	= this.codeName + " - " + this.code;
	this.key  	= this.id;
	//this.isLeaf	= this.children.isEmpty() ? true : false;			
	}
	
	public void addChilren(List<CodeHierarchy> children) {
		this.children = children;
	}
}
