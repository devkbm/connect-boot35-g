package com.like.hrm.staff.application.dto.staff;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.annotations.Generated;

/**
 * com.like.hrm.staff.application.dto.staff.QResponseStaffAppointmentRecord is a Querydsl Projection type for ResponseStaffAppointmentRecord
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QResponseStaffAppointmentRecord extends ConstructorExpression<ResponseStaffAppointmentRecord> {

    private static final long serialVersionUID = 982085551L;

    public QResponseStaffAppointmentRecord(com.querydsl.core.types.Expression<String> companyCode, com.querydsl.core.types.Expression<String> staffNo, com.querydsl.core.types.Expression<Long> seq, com.querydsl.core.types.Expression<java.time.LocalDate> appointmentDate, com.querydsl.core.types.Expression<java.time.LocalDate> appointmentEndDate, com.querydsl.core.types.Expression<String> recordName, com.querydsl.core.types.Expression<String> comment, com.querydsl.core.types.Expression<Boolean> isCompleted, com.querydsl.core.types.Expression<String> blngDeptCode, com.querydsl.core.types.Expression<String> blngDeptName, com.querydsl.core.types.Expression<String> workDeptCode, com.querydsl.core.types.Expression<String> workDeptName, com.querydsl.core.types.Expression<String> jobGroupCode, com.querydsl.core.types.Expression<String> jobGroupName, com.querydsl.core.types.Expression<String> jobPositionCode, com.querydsl.core.types.Expression<String> jobPositionName, com.querydsl.core.types.Expression<String> occupationCode, com.querydsl.core.types.Expression<String> occupationName, com.querydsl.core.types.Expression<String> jobGradeCode, com.querydsl.core.types.Expression<String> jobGradeName, com.querydsl.core.types.Expression<String> payStepCode, com.querydsl.core.types.Expression<String> payStepName, com.querydsl.core.types.Expression<String> jobCode, com.querydsl.core.types.Expression<String> jobName, com.querydsl.core.types.Expression<String> dutyResponsibilityCode, com.querydsl.core.types.Expression<String> dutyResponsibilityName) {
        super(ResponseStaffAppointmentRecord.class, new Class<?>[]{String.class, String.class, long.class, java.time.LocalDate.class, java.time.LocalDate.class, String.class, String.class, boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, companyCode, staffNo, seq, appointmentDate, appointmentEndDate, recordName, comment, isCompleted, blngDeptCode, blngDeptName, workDeptCode, workDeptName, jobGroupCode, jobGroupName, jobPositionCode, jobPositionName, occupationCode, occupationName, jobGradeCode, jobGradeName, payStepCode, payStepName, jobCode, jobName, dutyResponsibilityCode, dutyResponsibilityName);
    }

}

