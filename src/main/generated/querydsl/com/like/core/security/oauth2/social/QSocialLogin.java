package com.like.core.security.oauth2.social;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSocialLogin is a Querydsl query type for SocialLogin
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSocialLogin extends EntityPathBase<SocialLogin> {

    private static final long serialVersionUID = -2025484635L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSocialLogin socialLogin = new QSocialLogin("socialLogin");

    public final DateTimePath<java.time.LocalDateTime> createdDt = createDateTime("createdDt", java.time.LocalDateTime.class);

    public final StringPath email = createString("email");

    public final QSocialLoginID id;

    public final StringPath name = createString("name");

    public final StringPath userId = createString("userId");

    public final BooleanPath useYn = createBoolean("useYn");

    public QSocialLogin(String variable) {
        this(SocialLogin.class, forVariable(variable), INITS);
    }

    public QSocialLogin(Path<? extends SocialLogin> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSocialLogin(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSocialLogin(PathMetadata metadata, PathInits inits) {
        this(SocialLogin.class, metadata, inits);
    }

    public QSocialLogin(Class<? extends SocialLogin> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QSocialLoginID(forProperty("id")) : null;
    }

}

