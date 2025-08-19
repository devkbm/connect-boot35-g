package com.like.common.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPeriod is a Querydsl query type for Period
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPeriod extends BeanPath<Period> {

    private static final long serialVersionUID = 214627133L;

    public static final QPeriod period = new QPeriod("period");

    public final DateTimePath<java.time.LocalDateTime> from = createDateTime("from", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> to = createDateTime("to", java.time.LocalDateTime.class);

    public QPeriod(String variable) {
        super(Period.class, forVariable(variable));
    }

    public QPeriod(Path<? extends Period> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPeriod(PathMetadata metadata) {
        super(Period.class, metadata);
    }

}

