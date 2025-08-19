package com.like.hrm.staff.application.dto.staff;

import java.time.LocalDate;

import com.querydsl.core.annotations.QueryProjection;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseStaffDutyResponsibility {
	
	String companyCode;
	String staffNo;
	String staffName;
	Long seq;
	String dutyResponsibilityCode;
	String dutyResponsibilityName;
	LocalDate fromDate;
	LocalDate toDate;
	Boolean isPayApply;
		
	@QueryProjection
	public ResponseStaffDutyResponsibility(String companyCode
										  ,String staffNo
										  ,String staffName
										  ,Long seq
										  ,String dutyResponsibilityCode
										  ,String dutyResponsibilityName
										  ,LocalDate fromDate
										  ,LocalDate toDate
										  ,Boolean isPayApply) {		
		this.companyCode = companyCode;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.seq = seq;
		this.dutyResponsibilityCode = dutyResponsibilityCode;
		this.dutyResponsibilityName = dutyResponsibilityName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.isPayApply = isPayApply;
	}
	
	
}
