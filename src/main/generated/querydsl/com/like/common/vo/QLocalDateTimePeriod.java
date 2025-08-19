package com.like.common.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QLocalDateTimePeriod is a Querydsl query type for LocalDateTimePeriod
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QLocalDateTimePeriod extends BeanPath<LocalDateTimePeriod> {

    private static final long serialVersionUID = -2056040053L;

    public static final QLocalDateTimePeriod localDateTimePeriod = new QLocalDateTimePeriod("localDateTimePeriod");

    public final DateTimePath<java.time.LocalDateTime> from = createDateTime("from", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> to = createDateTime("to", java.time.LocalDateTime.class);

    public QLocalDateTimePeriod(String variable) {
        super(LocalDateTimePeriod.class, forVariable(variable));
    }

    public QLocalDateTimePeriod(Path<? extends LocalDateTimePeriod> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLocalDateTimePeriod(PathMetadata metadata) {
        super(LocalDateTimePeriod.class, metadata);
    }

}

