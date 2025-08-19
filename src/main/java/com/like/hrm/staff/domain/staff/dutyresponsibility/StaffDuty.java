package com.like.hrm.staff.domain.staff.dutyresponsibility;

import java.io.Serializable;
import java.time.LocalDate;

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

import com.like.core.jpa.domain.AbstractAuditEntity;
import com.like.hrm.staff.domain.staff.Staff;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "HRMSTAFFDUTYRESPONSIBILITY")
@EntityListeners(AuditingEntityListener.class)
public class StaffDuty extends AbstractAuditEntity implements Serializable {

	private static final long serialVersionUID = -5607018550367077054L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "ORG_CD", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name = "STAFF_NO", nullable=false, insertable=false, updatable=false)
	})
	private Staff staff;
	
	@EmbeddedId	
	StaffDutyId id;
				
	@Comment("직책코드")
	@Column(name="DUTY_RESPONSIBILITY_CODE")
	String dutyResponsibilityCode;
		
	@Comment("시작일자")
	@Column(name="FROM_DT")
	LocalDate fromDate;
	
	@Comment("종료일자")
	@Column(name="TO_DT")
	LocalDate toDate;
					
	@Comment("급여적용여부")
	@Column(name="PAY_APPLY_YN")
	Boolean isPayApply;	
	
	@Builder
	public StaffDuty(Staff staff, String dutyResponsibilityCode, LocalDate fromDate, LocalDate toDate, Boolean isPayApply) {
		this.staff = staff;		
		this.id = new StaffDutyId(staff, staff.getStaffDutyResponsibilityList().getNextSeq());
		this.dutyResponsibilityCode = dutyResponsibilityCode;	
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.isPayApply = isPayApply;
		
		staff.getStaffDutyResponsibilityList().add(this);
	}
	
	@Builder(builderMethodName = "modifyBuilder", buildMethodName = "modify")
	public void modifyEntity(String dutyResponsibilityCode
							,LocalDate fromDate
							,LocalDate toDate			
							,Boolean isPayApply) {
		this.dutyResponsibilityCode = dutyResponsibilityCode;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.isPayApply = isPayApply;
	}
}
