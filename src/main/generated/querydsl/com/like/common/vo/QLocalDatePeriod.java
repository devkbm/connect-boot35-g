package com.like.common.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QLocalDatePeriod is a Querydsl query type for LocalDatePeriod
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QLocalDatePeriod extends BeanPath<LocalDatePeriod> {

    private static final long serialVersionUID = 999290590L;

    public static final QLocalDatePeriod localDatePeriod = new QLocalDatePeriod("localDatePeriod");

    public final DatePath<java.time.LocalDate> from = createDate("from", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> to = createDate("to", java.time.LocalDate.class);

    public QLocalDatePeriod(String variable) {
        super(LocalDatePeriod.class, forVariable(variable));
    }

    public QLocalDatePeriod(Path<? extends LocalDatePeriod> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLocalDatePeriod(PathMetadata metadata) {
        super(LocalDatePeriod.class, metadata);
    }

}

