package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSystemUserCompanyRoleId is a Querydsl query type for SystemUserCompanyRoleId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSystemUserCompanyRoleId extends BeanPath<SystemUserCompanyRoleId> {

    private static final long serialVersionUID = -1932055080L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystemUserCompanyRoleId systemUserCompanyRoleId = new QSystemUserCompanyRoleId("systemUserCompanyRoleId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath roleCode = createString("roleCode");

    public final QSystemUserId userId;

    public QSystemUserCompanyRoleId(String variable) {
        this(SystemUserCompanyRoleId.class, forVariable(variable), INITS);
    }

    public QSystemUserCompanyRoleId(Path<? extends SystemUserCompanyRoleId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSystemUserCompanyRoleId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSystemUserCompanyRoleId(PathMetadata metadata, PathInits inits) {
        this(SystemUserCompanyRoleId.class, metadata, inits);
    }

    public QSystemUserCompanyRoleId(Class<? extends SystemUserCompanyRoleId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userId = inits.isInitialized("userId") ? new QSystemUserId(forProperty("userId")) : null;
    }

}

