package com.like.hrm.staff.application.port.in.staff.query;

import com.querydsl.core.annotations.QueryProjection;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StaffCurrentAppointmentQueryResultDTO {
	
	String companyCode;
	String staffNo;
	String blngDeptCode;
	String blngDeptName;
	String workDeptCode;
	String workDeptName;
	String jobGroupCode;
	String jobGroupName;
	String jobPositionCode;
	String jobPositionName;
	String occupationCode;
	String occupationName;
	String jobGradeCode;
	String jobGradeName;
	String payStepCode;
	String payStepName;
	String jobCode;
	String jobName;
	
	@QueryProjection
	public StaffCurrentAppointmentQueryResultDTO(
			String companyCode, 
			String staffNo, 
			String blngDeptCode,
			String blngDeptName, 
			String workDeptCode, 
			String workDeptName, 
			String jobGroupCode, 
			String jobGroupName,
			String jobPositionCode, 
			String jobPositionName, 
			String occupationCode, 
			String occupationName,
			String jobGradeCode, 
			String jobGradeName, 
			String payStepCode, 
			String payStepName, 
			String jobCode,
			String jobName
			) {				
		this.companyCode = companyCode;
		this.staffNo = staffNo;
		this.blngDeptCode = blngDeptCode;
		this.blngDeptName = blngDeptName;
		this.workDeptCode = workDeptCode;
		this.workDeptName = workDeptName;
		this.jobGroupCode = jobGroupCode;
		this.jobGroupName = jobGroupName;
		this.jobPositionCode = jobPositionCode;
		this.jobPositionName = jobPositionName;
		this.occupationCode = occupationCode;
		this.occupationName = occupationName;
		this.jobGradeCode = jobGradeCode;
		this.jobGradeName = jobGradeName;
		this.payStepCode = payStepCode;
		this.payStepName = payStepName;
		this.jobCode = jobCode;
		this.jobName = jobName;
	}		
	
}
