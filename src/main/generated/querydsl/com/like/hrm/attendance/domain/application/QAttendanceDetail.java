package com.like.hrm.attendance.domain.application;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAttendanceDetail is a Querydsl query type for AttendanceDetail
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAttendanceDetail extends EntityPathBase<AttendanceDetail> {

    private static final long serialVersionUID = 1557629170L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAttendanceDetail attendanceDetail = new QAttendanceDetail("attendanceDetail");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final QAttendanceApplication attendanceApplication;

    public final StringPath companyCode = createString("companyCode");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> detailId = createNumber("detailId", Long.class);

    public final StringPath dutyCode = createString("dutyCode");

    public final TimePath<java.time.LocalTime> hhmm = createTime("hhmm", java.time.LocalTime.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final com.like.common.vo.QLocalDatePeriod period;

    public final StringPath staffNo = createString("staffNo");

    public QAttendanceDetail(String variable) {
        this(AttendanceDetail.class, forVariable(variable), INITS);
    }

    public QAttendanceDetail(Path<? extends AttendanceDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAttendanceDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAttendanceDetail(PathMetadata metadata, PathInits inits) {
        this(AttendanceDetail.class, metadata, inits);
    }

    public QAttendanceDetail(Class<? extends AttendanceDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.attendanceApplication = inits.isInitialized("attendanceApplication") ? new QAttendanceApplication(forProperty("attendanceApplication")) : null;
        this.period = inits.isInitialized("period") ? new com.like.common.vo.QLocalDatePeriod(forProperty("period")) : null;
    }

}

