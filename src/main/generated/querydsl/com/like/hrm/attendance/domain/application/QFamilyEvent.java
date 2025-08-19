package com.like.hrm.attendance.domain.application;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QFamilyEvent is a Querydsl query type for FamilyEvent
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QFamilyEvent extends BeanPath<FamilyEvent> {

    private static final long serialVersionUID = 177281598L;

    public static final QFamilyEvent familyEvent = new QFamilyEvent("familyEvent");

    public final NumberPath<Long> familyEventAmt = createNumber("familyEventAmt", Long.class);

    public final DatePath<java.time.LocalDate> familyEventDay = createDate("familyEventDay", java.time.LocalDate.class);

    public QFamilyEvent(String variable) {
        super(FamilyEvent.class, forVariable(variable));
    }

    public QFamilyEvent(Path<? extends FamilyEvent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFamilyEvent(PathMetadata metadata) {
        super(FamilyEvent.class, metadata);
    }

}

