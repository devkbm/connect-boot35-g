package com.like.system.term.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.like.core.jpa.domain.AbstractAuditEntity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 단어 <br> 
 * 용어사전 등록 후보 
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "COMTERMWORD")
@EntityListeners(AuditingEntityListener.class)
public class WordDictionary extends AbstractAuditEntity {

	@Id
	@Column(name="LOGICAL_NAME", unique = true)
	String logicalName;
		
	@Column(name="LOGICAL_NAME_ENG")
	String logicalNameEng;
	
	@Column(name="PHYSICAL_NAME")
	String physicalName;
	
	@Column(name="CMT")
	String comment;
	
	public WordDictionary(String logicalName, String logicalNameEng, String physicalName, String comment) {
		Objects.requireNonNull(logicalName, "필수 입력 값입니다.");
		
		this.logicalName = logicalName;
		this.logicalNameEng = logicalNameEng;
		this.physicalName= physicalName;
		this.comment = comment;
	}
	
	public void modify(String logicalNameEng, String comment) {
		this.logicalNameEng = logicalNameEng;
		this.comment = comment;
	}
}
