package com.like.system.user.domain.oauth2;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSystemUserSocialEmail is a Querydsl query type for SystemUserSocialEmail
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSystemUserSocialEmail extends EntityPathBase<SystemUserSocialEmail> {

    private static final long serialVersionUID = 336919294L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystemUserSocialEmail systemUserSocialEmail = new QSystemUserSocialEmail("systemUserSocialEmail");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath email = createString("email");

    public final QSystemUserSocialEmailId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath registrationId = createString("registrationId");

    public QSystemUserSocialEmail(String variable) {
        this(SystemUserSocialEmail.class, forVariable(variable), INITS);
    }

    public QSystemUserSocialEmail(Path<? extends SystemUserSocialEmail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSystemUserSocialEmail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSystemUserSocialEmail(PathMetadata metadata, PathInits inits) {
        this(SystemUserSocialEmail.class, metadata, inits);
    }

    public QSystemUserSocialEmail(Class<? extends SystemUserSocialEmail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QSystemUserSocialEmailId(forProperty("id"), inits.get("id")) : null;
    }

}

