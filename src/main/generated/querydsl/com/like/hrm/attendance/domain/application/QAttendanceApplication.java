package com.like.hrm.attendance.domain.application;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QAttendanceApplication is a Querydsl query type for AttendanceApplication
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAttendanceApplication extends EntityPathBase<AttendanceApplication> {

    private static final long serialVersionUID = -1646735025L;

    public static final QAttendanceApplication attendanceApplication = new QAttendanceApplication("attendanceApplication");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final NumberPath<Long> appId = createNumber("appId", Long.class);

    public final StringPath companyCode = createString("companyCode");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath dutyReason = createString("dutyReason");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath staffNo = createString("staffNo");

    public QAttendanceApplication(String variable) {
        super(AttendanceApplication.class, forVariable(variable));
    }

    public QAttendanceApplication(Path<? extends AttendanceApplication> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAttendanceApplication(PathMetadata metadata) {
        super(AttendanceApplication.class, metadata);
    }

}

