package com.like.hrm.staff.domain.staff.appointment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QAppointmentRecordId is a Querydsl query type for AppointmentRecordId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAppointmentRecordId extends BeanPath<AppointmentRecordId> {

    private static final long serialVersionUID = 892205351L;

    public static final QAppointmentRecordId appointmentRecordId = new QAppointmentRecordId("appointmentRecordId");

    public final StringPath companyCode = createString("companyCode");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath staffNo = createString("staffNo");

    public QAppointmentRecordId(String variable) {
        super(AppointmentRecordId.class, forVariable(variable));
    }

    public QAppointmentRecordId(Path<? extends AppointmentRecordId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAppointmentRecordId(PathMetadata metadata) {
        super(AppointmentRecordId.class, metadata);
    }

}

