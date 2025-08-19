package com.like.hrm.staff.domain.staff.appointment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAppointmentRecord is a Querydsl query type for AppointmentRecord
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAppointmentRecord extends EntityPathBase<AppointmentRecord> {

    private static final long serialVersionUID = -1853818132L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAppointmentRecord appointmentRecord = new QAppointmentRecord("appointmentRecord");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final EnumPath<AppointmentApplyType> applyType = createEnum("applyType", AppointmentApplyType.class);

    public final DatePath<java.time.LocalDate> appointmentDate = createDate("appointmentDate", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> appointmentEndDate = createDate("appointmentEndDate", java.time.LocalDate.class);

    public final StringPath appointmentTypeCode = createString("appointmentTypeCode");

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QAppointmentRecordId id;

    public final QAppointmentInformation info;

    public final BooleanPath isCompleted = createBoolean("isCompleted");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath recordName = createString("recordName");

    public final com.like.hrm.staff.domain.staff.QStaff staff;

    public QAppointmentRecord(String variable) {
        this(AppointmentRecord.class, forVariable(variable), INITS);
    }

    public QAppointmentRecord(Path<? extends AppointmentRecord> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAppointmentRecord(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAppointmentRecord(PathMetadata metadata, PathInits inits) {
        this(AppointmentRecord.class, metadata, inits);
    }

    public QAppointmentRecord(Class<? extends AppointmentRecord> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QAppointmentRecordId(forProperty("id")) : null;
        this.info = inits.isInitialized("info") ? new QAppointmentInformation(forProperty("info")) : null;
        this.staff = inits.isInitialized("staff") ? new com.like.hrm.staff.domain.staff.QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

