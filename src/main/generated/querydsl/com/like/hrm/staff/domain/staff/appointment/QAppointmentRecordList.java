package com.like.hrm.staff.domain.staff.appointment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAppointmentRecordList is a Querydsl query type for AppointmentRecordList
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAppointmentRecordList extends BeanPath<AppointmentRecordList> {

    private static final long serialVersionUID = -1584019030L;

    public static final QAppointmentRecordList appointmentRecordList1 = new QAppointmentRecordList("appointmentRecordList1");

    public final SetPath<AppointmentRecord, QAppointmentRecord> appointmentRecordList = this.<AppointmentRecord, QAppointmentRecord>createSet("appointmentRecordList", AppointmentRecord.class, QAppointmentRecord.class, PathInits.DIRECT2);

    public QAppointmentRecordList(String variable) {
        super(AppointmentRecordList.class, forVariable(variable));
    }

    public QAppointmentRecordList(Path<? extends AppointmentRecordList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAppointmentRecordList(PathMetadata metadata) {
        super(AppointmentRecordList.class, metadata);
    }

}

