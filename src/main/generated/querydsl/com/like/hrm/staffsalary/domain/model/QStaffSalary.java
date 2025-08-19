package com.like.hrm.staffsalary.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffSalary is a Querydsl query type for StaffSalary
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaffSalary extends EntityPathBase<StaffSalary> {

    private static final long serialVersionUID = 257362100L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffSalary staffSalary = new QStaffSalary("staffSalary");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final QSalaryAppointmentInformation appointmentInfo;

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath id = createString("id");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final DatePath<java.time.LocalDate> payDate = createDate("payDate", java.time.LocalDate.class);

    public final StringPath salaryType = createString("salaryType");

    public final StringPath staffId = createString("staffId");

    public QStaffSalary(String variable) {
        this(StaffSalary.class, forVariable(variable), INITS);
    }

    public QStaffSalary(Path<? extends StaffSalary> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaffSalary(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaffSalary(PathMetadata metadata, PathInits inits) {
        this(StaffSalary.class, metadata, inits);
    }

    public QStaffSalary(Class<? extends StaffSalary> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.appointmentInfo = inits.isInitialized("appointmentInfo") ? new QSalaryAppointmentInformation(forProperty("appointmentInfo")) : null;
    }

}

