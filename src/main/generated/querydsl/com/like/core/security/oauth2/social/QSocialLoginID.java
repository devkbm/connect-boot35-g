package com.like.core.security.oauth2.social;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QSocialLoginID is a Querydsl query type for SocialLoginID
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSocialLoginID extends BeanPath<SocialLoginID> {

    private static final long serialVersionUID = -870546816L;

    public static final QSocialLoginID socialLoginID = new QSocialLoginID("socialLoginID");

    public final StringPath code = createString("code");

    public final StringPath registrationId = createString("registrationId");

    public QSocialLoginID(String variable) {
        super(SocialLoginID.class, forVariable(variable));
    }

    public QSocialLoginID(Path<? extends SocialLoginID> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSocialLoginID(PathMetadata metadata) {
        super(SocialLoginID.class, metadata);
    }

}

