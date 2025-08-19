package com.like.system.holiday.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QHolidayId is a Querydsl query type for HolidayId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QHolidayId extends BeanPath<HolidayId> {

    private static final long serialVersionUID = -186509708L;

    public static final QHolidayId holidayId = new QHolidayId("holidayId");

    public final StringPath companyCode = createString("companyCode");

    public final DatePath<java.time.LocalDate> date = createDate("date", java.time.LocalDate.class);

    public QHolidayId(String variable) {
        super(HolidayId.class, forVariable(variable));
    }

    public QHolidayId(Path<? extends HolidayId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHolidayId(PathMetadata metadata) {
        super(HolidayId.class, metadata);
    }

}

