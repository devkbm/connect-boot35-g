package com.like.hrm.staff.application.port.in.staff.appointment.select;

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PACKAGE)
public record StaffAppointmentRecordSelectDTO(
		String clientAppUrl,
		String companyCode,
		@NotEmpty			
		String staffNo,
		String staffName,			
		Long seq,
		String appointmentTypeCode,
		String applyType,
		LocalDate appointmentDate,
		LocalDate appointmentEndDate,			
		String recordName,
		String comment,				
		Boolean isCompleted,
		String blngDeptCode,			
		String workDeptCode,			
		String jobGroupCode,			
		String jobPositionCode,			
		String occupationCode,			
		String jobGradeCode,
		String payStepCode,			
		String jobCode,			
		String dutyResponsibilityCode
		) {
	/*
	public AppointmentRecord newEntity(Staff staff) {		
		AppointmentInformation info = newAppointmentInformation();
		
		return new AppointmentRecord(staff, appointmentTypeCode, appointmentDate, appointmentEndDate, recordName, comment, info);				
	}
	
	public void modifyEntity(AppointmentRecord entity) {
		
		AppointmentInformation info = newAppointmentInformation();
		
		entity.modify(appointmentDate
					 ,appointmentEndDate
					 ,recordName
					 ,comment
					 ,info);									
	}
			
	public static StaffAppointmentRecordDTO convert(AppointmentRecord entity) {
		if (entity == null) return null;																													

		Optional<AppointmentInformation> info = Optional.ofNullable(entity.getInfo());
		
		return StaffAppointmentRecordDTO.builder()											 
										 .staffNo(entity.getStaff().getId().staffNo())
										 .staffName(entity.getStaff().getName().getName())
										 .seq(entity.getId().getSeq())
										 .appointmentTypeCode(entity.getAppointmentTypeCode())
										 .appointmentDate(entity.getAppointmentDate())
										 .appointmentEndDate(entity.getAppointmentEndDate())
										 .recordName(entity.getRecordName())
										 .comment(entity.getComment())
										 .isCompleted(entity.getIsCompleted())
										 .blngDeptCode(info.map(AppointmentInformation::getBlngDeptCode).orElse(null))
										 .workDeptCode(info.map(AppointmentInformation::getWorkDeptCode).orElse(null))
										 .jobGroupCode(info.map(AppointmentInformation::getJobGroupCode).orElse(null))
										 .jobPositionCode(info.map(AppointmentInformation::getJobPositionCode).orElse(null))
										 .occupationCode(info.map(AppointmentInformation::getOccupationCode).orElse(null))
										 .jobGradeCode(info.map(AppointmentInformation::getJobGradeCode).orElse(null))
										 .payStepCode(info.map(AppointmentInformation::getPayStepCode).orElse(null))
										 .jobCode(info.map(AppointmentInformation::getJobCode).orElse(null))
										 .dutyResponsibilityCode(info.map(AppointmentInformation::getDutyResponsibilityCode).orElse(null))
										 .build();									
	}
	
	private AppointmentInformation newAppointmentInformation() {
		return new AppointmentInformation(blngDeptCode
										 ,workDeptCode
										 ,jobGroupCode
										 ,jobPositionCode
										 ,occupationCode
										 ,jobGradeCode
										 ,payStepCode
										 ,jobCode
										 ,dutyResponsibilityCode);
	}
	*/
}