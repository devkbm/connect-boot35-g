package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QSystemUserPassword is a Querydsl query type for SystemUserPassword
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSystemUserPassword extends BeanPath<SystemUserPassword> {

    private static final long serialVersionUID = -1777741423L;

    public static final QSystemUserPassword systemUserPassword = new QSystemUserPassword("systemUserPassword");

    public final StringPath password = createString("password");

    public QSystemUserPassword(String variable) {
        super(SystemUserPassword.class, forVariable(variable));
    }

    public QSystemUserPassword(Path<? extends SystemUserPassword> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemUserPassword(PathMetadata metadata) {
        super(SystemUserPassword.class, metadata);
    }

}

