package com.like.hrm.staff.domain.staff;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QCurrentAppointmentInformation is a Querydsl query type for CurrentAppointmentInformation
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCurrentAppointmentInformation extends BeanPath<CurrentAppointmentInformation> {

    private static final long serialVersionUID = -1232689263L;

    public static final QCurrentAppointmentInformation currentAppointmentInformation = new QCurrentAppointmentInformation("currentAppointmentInformation");

    public final StringPath blngDeptCode = createString("blngDeptCode");

    public final StringPath jobCode = createString("jobCode");

    public final StringPath jobGradeCode = createString("jobGradeCode");

    public final StringPath jobGroupCode = createString("jobGroupCode");

    public final StringPath jobPositionCode = createString("jobPositionCode");

    public final StringPath occupationCode = createString("occupationCode");

    public final StringPath payStepCode = createString("payStepCode");

    public final StringPath workDeptCode = createString("workDeptCode");

    public QCurrentAppointmentInformation(String variable) {
        super(CurrentAppointmentInformation.class, forVariable(variable));
    }

    public QCurrentAppointmentInformation(Path<? extends CurrentAppointmentInformation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCurrentAppointmentInformation(PathMetadata metadata) {
        super(CurrentAppointmentInformation.class, metadata);
    }

}

