package com.like.hrm.staff.domain.staff.period;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffPeriod is a Querydsl query type for StaffPeriod
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaffPeriod extends EntityPathBase<StaffPeriod> {

    private static final long serialVersionUID = -2077785591L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffPeriod staffPeriod = new QStaffPeriod("staffPeriod");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QStaffPeriodId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final com.like.common.vo.QLocalDatePeriod period;

    public final com.like.hrm.staff.domain.staff.QStaff staff;

    public QStaffPeriod(String variable) {
        this(StaffPeriod.class, forVariable(variable), INITS);
    }

    public QStaffPeriod(Path<? extends StaffPeriod> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaffPeriod(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaffPeriod(PathMetadata metadata, PathInits inits) {
        this(StaffPeriod.class, metadata, inits);
    }

    public QStaffPeriod(Class<? extends StaffPeriod> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QStaffPeriodId(forProperty("id")) : null;
        this.period = inits.isInitialized("period") ? new com.like.common.vo.QLocalDatePeriod(forProperty("period")) : null;
        this.staff = inits.isInitialized("staff") ? new com.like.hrm.staff.domain.staff.QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

