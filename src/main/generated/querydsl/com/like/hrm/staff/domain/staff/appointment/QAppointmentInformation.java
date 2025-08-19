package com.like.hrm.staff.domain.staff.appointment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QAppointmentInformation is a Querydsl query type for AppointmentInformation
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAppointmentInformation extends BeanPath<AppointmentInformation> {

    private static final long serialVersionUID = -1190932623L;

    public static final QAppointmentInformation appointmentInformation = new QAppointmentInformation("appointmentInformation");

    public final StringPath blngDeptCode = createString("blngDeptCode");

    public final StringPath dutyResponsibilityCode = createString("dutyResponsibilityCode");

    public final StringPath jobCode = createString("jobCode");

    public final StringPath jobGradeCode = createString("jobGradeCode");

    public final StringPath jobGroupCode = createString("jobGroupCode");

    public final StringPath jobPositionCode = createString("jobPositionCode");

    public final StringPath occupationCode = createString("occupationCode");

    public final StringPath payStepCode = createString("payStepCode");

    public final StringPath workDeptCode = createString("workDeptCode");

    public QAppointmentInformation(String variable) {
        super(AppointmentInformation.class, forVariable(variable));
    }

    public QAppointmentInformation(Path<? extends AppointmentInformation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAppointmentInformation(PathMetadata metadata) {
        super(AppointmentInformation.class, metadata);
    }

}

