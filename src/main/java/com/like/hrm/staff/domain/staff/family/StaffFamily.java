package com.like.hrm.staff.domain.staff.family;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.like.core.jpa.domain.AbstractAuditEntity;
import com.like.hrm.staff.domain.staff.Staff;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true, value = {"staff"})
@EqualsAndHashCode(callSuper = false, of = {"id"})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "HRMSTAFFFAMILY")
@EntityListeners(AuditingEntityListener.class)
public class StaffFamily extends AbstractAuditEntity implements Serializable {
			
	private static final long serialVersionUID = -3377701513438383323L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "ORG_CD", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name = "STAFF_NO", nullable=false, insertable=false, updatable=false)
	})
	Staff staff;
	
	@EmbeddedId
	StaffFamilyId id;	
		
	@Comment("가족성명")
	@Column(name="FAMILY_NAME", nullable = false)
	String name;
	
	@Comment("주민등록번호")
	@Column(name="RREGNO", nullable = false)
	String residentRegistrationNumber;
		
	@Comment("가족관계")
	@Column(name="FAMILY_REL_CODE", nullable = false)
	String relation;
		
	@Comment("직업명")
	@Column(name="OCCUPATION_NAME", nullable = true)
	String occupation;
		
	@Comment("학력구분")
	@Column(name="SCHOOL_CAREER_CODE", nullable = true)
	String schoolCareerType;
		
	@Comment("비고")
	@Column(name="CMT", nullable = true)
	String comment;
	
	@Builder
	public StaffFamily(Staff staff
					  ,String name
					  ,String residentRegistrationNumber
					  ,String relation
					  ,String occupation
					  ,String schoolCareerType
					  ,String comment) {		
		this.staff = staff;
		this.id = new StaffFamilyId(staff, staff.getFamilyList().getNextSequence());
		this.name = name;
		this.residentRegistrationNumber = residentRegistrationNumber;
		this.relation = relation;
		this.occupation = occupation;
		this.schoolCareerType = schoolCareerType;
		this.comment = comment;
	}
	
	@Builder(builderMethodName = "modifyBuilder", buildMethodName = "modify")
	public void modifyEntity(String name
							,String residentRegistrationNumber
							,String relation
							,String occupation
							,String schoolCareerType
							,String comment) {
		this.name = name;
		this.residentRegistrationNumber = residentRegistrationNumber;
		this.relation = relation;
		this.occupation = occupation;
		this.schoolCareerType = schoolCareerType;
		this.comment = comment;
	}
}
