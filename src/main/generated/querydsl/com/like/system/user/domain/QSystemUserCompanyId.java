package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSystemUserCompanyId is a Querydsl query type for SystemUserCompanyId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSystemUserCompanyId extends BeanPath<SystemUserCompanyId> {

    private static final long serialVersionUID = 239919682L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystemUserCompanyId systemUserCompanyId = new QSystemUserCompanyId("systemUserCompanyId");

    public final StringPath companyCode = createString("companyCode");

    public final QSystemUserId userId;

    public QSystemUserCompanyId(String variable) {
        this(SystemUserCompanyId.class, forVariable(variable), INITS);
    }

    public QSystemUserCompanyId(Path<? extends SystemUserCompanyId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSystemUserCompanyId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSystemUserCompanyId(PathMetadata metadata, PathInits inits) {
        this(SystemUserCompanyId.class, metadata, inits);
    }

    public QSystemUserCompanyId(Class<? extends SystemUserCompanyId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userId = inits.isInitialized("userId") ? new QSystemUserId(forProperty("userId")) : null;
    }

}

