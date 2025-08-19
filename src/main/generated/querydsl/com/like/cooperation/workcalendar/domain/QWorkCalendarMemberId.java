package com.like.cooperation.workcalendar.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QWorkCalendarMemberId is a Querydsl query type for WorkCalendarMemberId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QWorkCalendarMemberId extends BeanPath<WorkCalendarMemberId> {

    private static final long serialVersionUID = 2028474540L;

    public static final QWorkCalendarMemberId workCalendarMemberId = new QWorkCalendarMemberId("workCalendarMemberId");

    public final StringPath userId = createString("userId");

    public final NumberPath<Long> workCalendar = createNumber("workCalendar", Long.class);

    public QWorkCalendarMemberId(String variable) {
        super(WorkCalendarMemberId.class, forVariable(variable));
    }

    public QWorkCalendarMemberId(Path<? extends WorkCalendarMemberId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkCalendarMemberId(PathMetadata metadata) {
        super(WorkCalendarMemberId.class, metadata);
    }

}

