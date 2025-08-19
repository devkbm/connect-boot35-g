package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QSystemUserId is a Querydsl query type for SystemUserId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSystemUserId extends BeanPath<SystemUserId> {

    private static final long serialVersionUID = 423761041L;

    public static final QSystemUserId systemUserId = new QSystemUserId("systemUserId");

    public final StringPath userId = createString("userId");

    public QSystemUserId(String variable) {
        super(SystemUserId.class, forVariable(variable));
    }

    public QSystemUserId(Path<? extends SystemUserId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemUserId(PathMetadata metadata) {
        super(SystemUserId.class, metadata);
    }

}

