package com.like.cooperation.workcalendar.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkCalendar is a Querydsl query type for WorkCalendar
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkCalendar extends EntityPathBase<WorkCalendar> {

    private static final long serialVersionUID = -814907849L;

    public static final QWorkCalendar workCalendar = new QWorkCalendar("workCalendar");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath color = createString("color");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final ListPath<WorkCalendarEvent, QWorkCalendarEvent> eventList = this.<WorkCalendarEvent, QWorkCalendarEvent>createList("eventList", WorkCalendarEvent.class, QWorkCalendarEvent.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<WorkCalendarMember, QWorkCalendarMember> memberList = this.<WorkCalendarMember, QWorkCalendarMember>createSet("memberList", WorkCalendarMember.class, QWorkCalendarMember.class, PathInits.DIRECT2);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath name = createString("name");

    public QWorkCalendar(String variable) {
        super(WorkCalendar.class, forVariable(variable));
    }

    public QWorkCalendar(Path<? extends WorkCalendar> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkCalendar(PathMetadata metadata) {
        super(WorkCalendar.class, metadata);
    }

}

