package com.like.hrm.staff.adapter.out.db.staff.querydsl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.hrm.hrmcode.domain.QHrmCode;
import com.like.hrm.staff.application.dto.staff.QResponseStaffAppointmentRecord;
import com.like.hrm.staff.application.dto.staff.QResponseStaffDutyResponsibility;
import com.like.hrm.staff.application.dto.staff.ResponseStaffAppointmentRecord;
import com.like.hrm.staff.application.dto.staff.ResponseStaffDutyResponsibility;
import com.like.hrm.staff.application.port.in.staff.query.QStaffCurrentAppointmentQueryResultDTO;
import com.like.hrm.staff.application.port.in.staff.query.StaffCurrentAppointmentQueryResultDTO;
import com.like.hrm.staff.application.port.in.staff.query.StaffQueryDTO;
import com.like.hrm.staff.domain.staff.QStaff;
import com.like.hrm.staff.domain.staff.appointment.QAppointmentRecord;
import com.like.hrm.staff.domain.staff.dutyresponsibility.QStaffDuty;
import com.like.hrm.staff.domain.staff.Staff;

import com.like.system.dept.domain.QDept;
import com.querydsl.jpa.impl.JPAQueryFactory;


@Repository
public class StaffQuery {

	private JPAQueryFactory queryFactory;	
	private final QStaff qStaff = QStaff.staff;
	private final QAppointmentRecord qAppointmentRecord = QAppointmentRecord.appointmentRecord;
	private final QStaffDuty qStaffDuty = QStaffDuty.staffDuty;
	
	public StaffQuery(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}
	
	
	public List<Staff> getStaffList(StaffQueryDTO dto) {
		return queryFactory.selectFrom(qStaff).fetch();
	}
	
	/*
	@Override
	public List<ResponseStaffAppointmentRecord> getStaffAppointmentRecordList(String companyCode, String staffNo) {		
		
		QDept blngDeptCode = QDept.dept;
		QDept workDeptCode = new QDept("workDeptCode");
		
		QHrmCode jobGroupCode = QHrmCode.hrmCode;
		QHrmCode jobPositionCode = new QHrmCode("jobPositionCode");
		QHrmCode occupationCode = new QHrmCode("occupationCode");
		QHrmCode jobGradeCode = new QHrmCode("jobGradeCode");
		QHrmCode payStepCode = new QHrmCode("payStepCode");
		QHrmCode jobCode = new QHrmCode("jobCode");				
		QHrmCode dutyResponsibilityCode = new QHrmCode("dutyResponsibilityCode");
				
		return queryFactory.select(projectionAppointmentRecord(qStaff
											  ,qAppointmentRecord
											  ,blngDeptCode
											  ,workDeptCode
											  ,jobGroupCode
											  ,jobPositionCode
											  ,occupationCode
											  ,jobGradeCode
											  ,payStepCode
											  ,jobCode
											  ,dutyResponsibilityCode))
						   .from(qStaff)
						   .join(qAppointmentRecord)
						   		.on(qStaff.id.eq(qAppointmentRecord.staff.id))
						   .leftJoin(blngDeptCode)
						   		.on(blngDeptCode.id.companyCode.eq(qStaff.id.companyCode)
						   		.and(blngDeptCode.id.deptCode.eq(qAppointmentRecord.info.blngDeptCode)))
					   	   .leftJoin(workDeptCode)
					   			.on(workDeptCode.id.companyCode.eq(qStaff.id.companyCode)
					   			.and(workDeptCode.id.deptCode.eq(qAppointmentRecord.info.workDeptCode)))
						   .leftJoin(jobGroupCode)
						   		.on(jobGroupCode.id.typeId.eq("HR0001")
						   		.and(qAppointmentRecord.info.jobGroupCode.eq(jobGroupCode.id.code)))
						   .leftJoin(jobPositionCode)
						   		.on(jobPositionCode.id.typeId.eq("HR0002")
						   		.and(qAppointmentRecord.info.jobPositionCode.eq(jobPositionCode.id.code)))
						   .leftJoin(occupationCode)
						   		.on(occupationCode.id.typeId.eq("HR0003")
						   		.and(qAppointmentRecord.info.occupationCode.eq(occupationCode.id.code)))
						   .leftJoin(jobGradeCode)
						   		.on(jobGradeCode.id.typeId.eq("HR0004")
						   		.and(qAppointmentRecord.info.jobGradeCode.eq(jobGradeCode.id.code)))
						   .leftJoin(payStepCode)
						   		.on(payStepCode.id.typeId.eq("HR0005")
						   		.and(qAppointmentRecord.info.payStepCode.eq(payStepCode.id.code)))
						   .leftJoin(jobCode)
						   		.on(jobCode.id.typeId.eq("HR0006")
						   		.and(qAppointmentRecord.info.jobCode.eq(jobCode.id.code)))
						   .leftJoin(dutyResponsibilityCode)
						   		.on(dutyResponsibilityCode.id.typeId.eq("HR0007")
						   		.and(qAppointmentRecord.info.dutyResponsibilityCode.eq(dutyResponsibilityCode.id.code)))
						   .where(qStaff.id.companyCode.eq(companyCode)
							 .and(qStaff.id.staffNo.eq(staffNo)))
						   .fetch();						   
	}
	*/
	
	
	public StaffCurrentAppointmentQueryResultDTO getStaffCurrentAppointment(String companyCode, String staffNo) {

		QDept blngDeptCode = QDept.dept;
		QDept workDeptCode = new QDept("workDeptCode");
		
		QHrmCode jobGroupCode = QHrmCode.hrmCode;
		QHrmCode jobPositionCode = new QHrmCode("jobPositionCode");
		QHrmCode occupationCode = new QHrmCode("occupationCode");
		QHrmCode jobGradeCode = new QHrmCode("jobGradeCode");
		QHrmCode payStepCode = new QHrmCode("payStepCode");
		QHrmCode jobCode = new QHrmCode("jobCode");			
				
		return queryFactory.select(projectionCurrentAppointment(qStaff
											 ,blngDeptCode
											 ,workDeptCode
											 ,jobGroupCode
											 ,jobPositionCode
											 ,occupationCode
											 ,jobGradeCode
											 ,payStepCode
											 ,jobCode))
					.from(qStaff)				
					.leftJoin(blngDeptCode)
						.on(blngDeptCode.id.companyCode.eq(qStaff.id.companyCode)
			   			.and(blngDeptCode.id.deptCode.eq(qStaff.currentAppointment.blngDeptCode)))
					.leftJoin(workDeptCode)
			   			.on(workDeptCode.id.companyCode.eq(qStaff.id.companyCode)
			   			.and(workDeptCode.id.deptCode.eq(qStaff.currentAppointment.workDeptCode)))
			   		.leftJoin(jobGroupCode)
				   		.on(jobGroupCode.id.typeId.eq("HR0001")
				   		.and(qStaff.currentAppointment.jobGroupCode.eq(jobGroupCode.id.code)))
				   	.leftJoin(jobPositionCode)
				   		.on(jobPositionCode.id.typeId.eq("HR0002")
				   		.and(qStaff.currentAppointment.jobPositionCode.eq(jobPositionCode.id.code)))
				   	.leftJoin(occupationCode)
				   		.on(occupationCode.id.typeId.eq("HR0003")
				   		.and(qStaff.currentAppointment.occupationCode.eq(occupationCode.id.code)))
				   	.leftJoin(jobGradeCode)
				   		.on(jobGradeCode.id.typeId.eq("HR0004")
				   		.and(qStaff.currentAppointment.jobGradeCode.eq(jobGradeCode.id.code)))
				   	.leftJoin(payStepCode)
				   		.on(payStepCode.id.typeId.eq("HR0005")
				   		.and(qStaff.currentAppointment.payStepCode.eq(payStepCode.id.code)))
				   	.leftJoin(jobCode)
				   		.on(jobCode.id.typeId.eq("HR0006")
				   		.and(qStaff.currentAppointment.jobCode.eq(jobCode.id.code)))				   
				   	.where(qStaff.id.companyCode.eq(companyCode)
					  .and(qStaff.id.staffNo.eq(staffNo)))
				   	.fetchFirst();				   	
	}
	
	/*
	@Override
	public List<ResponseStaffDutyResponsibility> getStaffDutyResponsibility(String companyCode, String staffNo) {
		QHrmCode dutyResponsibilityCode = new QHrmCode("dutyResponsibilityCode");
				
		return queryFactory.select(pro(qStaff, qStaffDuty, dutyResponsibilityCode))
						   .from(qStaff)
						   .join(qStaffDuty)
					   			.on(qStaff.id.eq(qStaffDuty.staff.id))
						   .leftJoin(dutyResponsibilityCode)
					   	   		.on(dutyResponsibilityCode.id.typeId.eq("HR0007")
					   	   		.and(qStaffDuty.dutyResponsibilityCode.eq(dutyResponsibilityCode.id.code)))
						   .fetch();		
	}
	*/
	
	private QResponseStaffAppointmentRecord projectionAppointmentRecord(QStaff qStaff								
											, QAppointmentRecord qRecord
											, QDept blngDeptCode
											, QDept workDeptCode
											, QHrmCode jobGroupCode
											, QHrmCode jobPositionCode
											, QHrmCode occupationCode
											, QHrmCode jobGradeCode
											, QHrmCode payStepCode
											, QHrmCode jobCode
											, QHrmCode dutyResponsibilityCode) {
		
		return new QResponseStaffAppointmentRecord(qStaff.id.companyCode
											   	  ,qStaff.id.staffNo
												  ,qRecord.id.seq
												  ,qRecord.appointmentDate
												  ,qRecord.appointmentEndDate
												  ,qRecord.recordName
												  ,qRecord.comment
												  ,qRecord.isCompleted
												  ,qRecord.info.blngDeptCode
												  ,blngDeptCode.deptNameKorean
												  ,qRecord.info.workDeptCode
												  ,workDeptCode.deptNameKorean
												  ,qRecord.info.jobGroupCode
												  ,jobGroupCode.codeName
												  ,qRecord.info.jobPositionCode
												  ,jobPositionCode.codeName
												  ,qRecord.info.occupationCode
												  ,occupationCode.codeName
												  ,qRecord.info.jobGradeCode
												  ,jobGradeCode.codeName
												  ,qRecord.info.payStepCode
												  ,payStepCode.codeName
												  ,qRecord.info.jobCode
												  ,jobCode.codeName
												  ,qRecord.info.dutyResponsibilityCode
												  ,dutyResponsibilityCode.codeName);
	}

	
	private QStaffCurrentAppointmentQueryResultDTO projectionCurrentAppointment(QStaff qStaff			
													   ,QDept blngDeptCode
													   ,QDept workDeptCode
													   ,QHrmCode jobGroupCode
													   ,QHrmCode jobPositionCode
													   ,QHrmCode occupationCode
													   ,QHrmCode jobGradeCode
													   ,QHrmCode payStepCode
													   ,QHrmCode jobCode) {
		return new QStaffCurrentAppointmentQueryResultDTO(qStaff.id.companyCode
												   ,qStaff.id.staffNo
												   ,qStaff.currentAppointment.blngDeptCode
												   ,blngDeptCode.deptNameKorean
												   ,qStaff.currentAppointment.workDeptCode
												   ,workDeptCode.deptNameKorean
												   ,qStaff.currentAppointment.jobGroupCode
												   ,jobGroupCode.codeName
												   ,qStaff.currentAppointment.jobPositionCode
												   ,jobPositionCode.codeName
												   ,qStaff.currentAppointment.occupationCode
												   ,occupationCode.codeName
												   ,qStaff.currentAppointment.jobGradeCode
												   ,jobGradeCode.codeName
												   ,qStaff.currentAppointment.payStepCode
												   ,payStepCode.codeName
												   ,qStaff.currentAppointment.jobCode
												   ,jobCode.codeName);
	}

	/*
	 * 	public ResponseStaffDutyResponsibility(String staffId
										  ,String staffNo
										  ,String staffName
										  ,Integer seq
										  ,String dutyResponsibilityCode
										  ,String dutyResponsibilityName
										  ,LocalDate fromDate
										  ,LocalDate toDate
										  ,Boolean isPayApply) {	
	 */
	
	private QResponseStaffDutyResponsibility pro(QStaff qStaff, QStaffDuty qStaffDuty, QHrmCode dutyResponsibilityCode) {
		return new QResponseStaffDutyResponsibility(qStaff.id.companyCode
												   ,qStaff.id.staffNo
												   ,qStaff.name.name
												   ,qStaffDuty.id.seq
												   ,dutyResponsibilityCode.id.code
												   ,dutyResponsibilityCode.codeName
												   ,qStaffDuty.fromDate
												   ,qStaffDuty.toDate
												   ,qStaffDuty.isPayApply);
	}
	

}
