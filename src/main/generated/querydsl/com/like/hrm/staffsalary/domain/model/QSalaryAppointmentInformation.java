package com.like.hrm.staffsalary.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QSalaryAppointmentInformation is a Querydsl query type for SalaryAppointmentInformation
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSalaryAppointmentInformation extends BeanPath<SalaryAppointmentInformation> {

    private static final long serialVersionUID = -761883699L;

    public static final QSalaryAppointmentInformation salaryAppointmentInformation = new QSalaryAppointmentInformation("salaryAppointmentInformation");

    public final StringPath blngDeptCode = createString("blngDeptCode");

    public final StringPath dutyResponsibilityCode = createString("dutyResponsibilityCode");

    public final StringPath jobCode = createString("jobCode");

    public final StringPath jobGradeCode = createString("jobGradeCode");

    public final StringPath jobGroupCode = createString("jobGroupCode");

    public final StringPath jobPositionCode = createString("jobPositionCode");

    public final StringPath occupationCode = createString("occupationCode");

    public final StringPath payStepCode = createString("payStepCode");

    public final StringPath workDeptCode = createString("workDeptCode");

    public QSalaryAppointmentInformation(String variable) {
        super(SalaryAppointmentInformation.class, forVariable(variable));
    }

    public QSalaryAppointmentInformation(Path<? extends SalaryAppointmentInformation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalaryAppointmentInformation(PathMetadata metadata) {
        super(SalaryAppointmentInformation.class, metadata);
    }

}

