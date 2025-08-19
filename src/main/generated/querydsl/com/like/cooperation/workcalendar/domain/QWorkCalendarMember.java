package com.like.cooperation.workcalendar.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkCalendarMember is a Querydsl query type for WorkCalendarMember
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkCalendarMember extends EntityPathBase<WorkCalendarMember> {

    private static final long serialVersionUID = 24457137L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkCalendarMember workCalendarMember = new QWorkCalendarMember("workCalendarMember");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QWorkCalendarMemberId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final QWorkCalendar workCalendar;

    public QWorkCalendarMember(String variable) {
        this(WorkCalendarMember.class, forVariable(variable), INITS);
    }

    public QWorkCalendarMember(Path<? extends WorkCalendarMember> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkCalendarMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkCalendarMember(PathMetadata metadata, PathInits inits) {
        this(WorkCalendarMember.class, metadata, inits);
    }

    public QWorkCalendarMember(Class<? extends WorkCalendarMember> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QWorkCalendarMemberId(forProperty("id")) : null;
        this.workCalendar = inits.isInitialized("workCalendar") ? new QWorkCalendar(forProperty("workCalendar")) : null;
    }

}

