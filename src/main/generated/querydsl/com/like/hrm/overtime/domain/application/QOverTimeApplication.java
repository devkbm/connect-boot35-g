package com.like.hrm.overtime.domain.application;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QOverTimeApplication is a Querydsl query type for OverTimeApplication
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOverTimeApplication extends EntityPathBase<OverTimeApplication> {

    private static final long serialVersionUID = 110398079L;

    public static final QOverTimeApplication overTimeApplication = new QOverTimeApplication("overTimeApplication");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath companyCode = createString("companyCode");

    public final StringPath contents = createString("contents");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final DateTimePath<java.time.LocalDateTime> from = createDateTime("from", java.time.LocalDateTime.class);

    public final NumberPath<Long> holyDayNightOverTimeMinute = createNumber("holyDayNightOverTimeMinute", Long.class);

    public final NumberPath<Long> holyDayOverTimeMinute = createNumber("holyDayOverTimeMinute", Long.class);

    public final StringPath location = createString("location");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final NumberPath<Long> nightOverTimeMinute = createNumber("nightOverTimeMinute", Long.class);

    public final NumberPath<Long> overTimeMinute = createNumber("overTimeMinute", Long.class);

    public final NumberPath<Long> ovtmId = createNumber("ovtmId", Long.class);

    public final StringPath staffNo = createString("staffNo");

    public final DateTimePath<java.time.LocalDateTime> to = createDateTime("to", java.time.LocalDateTime.class);

    public QOverTimeApplication(String variable) {
        super(OverTimeApplication.class, forVariable(variable));
    }

    public QOverTimeApplication(Path<? extends OverTimeApplication> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOverTimeApplication(PathMetadata metadata) {
        super(OverTimeApplication.class, metadata);
    }

}

