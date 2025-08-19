package com.like.common.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmail is a Querydsl query type for Email
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QEmail extends BeanPath<Email> {

    private static final long serialVersionUID = -1804128608L;

    public static final QEmail email = new QEmail("email");

    public final StringPath address = createString("address");

    public QEmail(String variable) {
        super(Email.class, forVariable(variable));
    }

    public QEmail(Path<? extends Email> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmail(PathMetadata metadata) {
        super(Email.class, metadata);
    }

}

