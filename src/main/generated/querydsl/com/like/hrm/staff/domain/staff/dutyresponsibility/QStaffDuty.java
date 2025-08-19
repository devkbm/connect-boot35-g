package com.like.hrm.staff.domain.staff.dutyresponsibility;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffDuty is a Querydsl query type for StaffDuty
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaffDuty extends EntityPathBase<StaffDuty> {

    private static final long serialVersionUID = -1797810559L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffDuty staffDuty = new QStaffDuty("staffDuty");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath dutyResponsibilityCode = createString("dutyResponsibilityCode");

    public final DatePath<java.time.LocalDate> fromDate = createDate("fromDate", java.time.LocalDate.class);

    public final QStaffDutyId id;

    public final BooleanPath isPayApply = createBoolean("isPayApply");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final com.like.hrm.staff.domain.staff.QStaff staff;

    public final DatePath<java.time.LocalDate> toDate = createDate("toDate", java.time.LocalDate.class);

    public QStaffDuty(String variable) {
        this(StaffDuty.class, forVariable(variable), INITS);
    }

    public QStaffDuty(Path<? extends StaffDuty> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaffDuty(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaffDuty(PathMetadata metadata, PathInits inits) {
        this(StaffDuty.class, metadata, inits);
    }

    public QStaffDuty(Class<? extends StaffDuty> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QStaffDutyId(forProperty("id")) : null;
        this.staff = inits.isInitialized("staff") ? new com.like.hrm.staff.domain.staff.QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

