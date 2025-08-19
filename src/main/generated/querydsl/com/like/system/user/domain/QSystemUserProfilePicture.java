package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QSystemUserProfilePicture is a Querydsl query type for SystemUserProfilePicture
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSystemUserProfilePicture extends BeanPath<SystemUserProfilePicture> {

    private static final long serialVersionUID = 2012836235L;

    public static final QSystemUserProfilePicture systemUserProfilePicture = new QSystemUserProfilePicture("systemUserProfilePicture");

    public final StringPath image = createString("image");

    public QSystemUserProfilePicture(String variable) {
        super(SystemUserProfilePicture.class, forVariable(variable));
    }

    public QSystemUserProfilePicture(Path<? extends SystemUserProfilePicture> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemUserProfilePicture(PathMetadata metadata) {
        super(SystemUserProfilePicture.class, metadata);
    }

}

