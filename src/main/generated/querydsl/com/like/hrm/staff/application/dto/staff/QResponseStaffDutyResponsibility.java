package com.like.hrm.staff.application.dto.staff;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.annotations.Generated;

/**
 * com.like.hrm.staff.application.dto.staff.QResponseStaffDutyResponsibility is a Querydsl Projection type for ResponseStaffDutyResponsibility
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QResponseStaffDutyResponsibility extends ConstructorExpression<ResponseStaffDutyResponsibility> {

    private static final long serialVersionUID = -388344955L;

    public QResponseStaffDutyResponsibility(com.querydsl.core.types.Expression<String> companyCode, com.querydsl.core.types.Expression<String> staffNo, com.querydsl.core.types.Expression<String> staffName, com.querydsl.core.types.Expression<Long> seq, com.querydsl.core.types.Expression<String> dutyResponsibilityCode, com.querydsl.core.types.Expression<String> dutyResponsibilityName, com.querydsl.core.types.Expression<java.time.LocalDate> fromDate, com.querydsl.core.types.Expression<java.time.LocalDate> toDate, com.querydsl.core.types.Expression<Boolean> isPayApply) {
        super(ResponseStaffDutyResponsibility.class, new Class<?>[]{String.class, String.class, String.class, long.class, String.class, String.class, java.time.LocalDate.class, java.time.LocalDate.class, boolean.class}, companyCode, staffNo, staffName, seq, dutyResponsibilityCode, dutyResponsibilityName, fromDate, toDate, isPayApply);
    }

}

