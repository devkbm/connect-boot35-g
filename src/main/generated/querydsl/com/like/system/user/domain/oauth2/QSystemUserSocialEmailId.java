package com.like.system.user.domain.oauth2;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSystemUserSocialEmailId is a Querydsl query type for SystemUserSocialEmailId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSystemUserSocialEmailId extends BeanPath<SystemUserSocialEmailId> {

    private static final long serialVersionUID = 1656896697L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystemUserSocialEmailId systemUserSocialEmailId = new QSystemUserSocialEmailId("systemUserSocialEmailId");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final com.like.system.user.domain.QSystemUserId userId;

    public QSystemUserSocialEmailId(String variable) {
        this(SystemUserSocialEmailId.class, forVariable(variable), INITS);
    }

    public QSystemUserSocialEmailId(Path<? extends SystemUserSocialEmailId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSystemUserSocialEmailId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSystemUserSocialEmailId(PathMetadata metadata, PathInits inits) {
        this(SystemUserSocialEmailId.class, metadata, inits);
    }

    public QSystemUserSocialEmailId(Class<? extends SystemUserSocialEmailId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userId = inits.isInitialized("userId") ? new com.like.system.user.domain.QSystemUserId(forProperty("userId")) : null;
    }

}

