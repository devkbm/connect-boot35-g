package com.like.cooperation.workcalendar.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkCalendarEvent is a Querydsl query type for WorkCalendarEvent
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkCalendarEvent extends EntityPathBase<WorkCalendarEvent> {

    private static final long serialVersionUID = 825183907L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkCalendarEvent workCalendarEvent = new QWorkCalendarEvent("workCalendarEvent");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final BooleanPath allDay = createBoolean("allDay");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final DateTimePath<java.time.LocalDateTime> end = createDateTime("end", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final DateTimePath<java.time.LocalDateTime> start = createDateTime("start", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public final QWorkCalendar workCalendar;

    public QWorkCalendarEvent(String variable) {
        this(WorkCalendarEvent.class, forVariable(variable), INITS);
    }

    public QWorkCalendarEvent(Path<? extends WorkCalendarEvent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkCalendarEvent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkCalendarEvent(PathMetadata metadata, PathInits inits) {
        this(WorkCalendarEvent.class, metadata, inits);
    }

    public QWorkCalendarEvent(Class<? extends WorkCalendarEvent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.workCalendar = inits.isInitialized("workCalendar") ? new QWorkCalendar(forProperty("workCalendar")) : null;
    }

}

