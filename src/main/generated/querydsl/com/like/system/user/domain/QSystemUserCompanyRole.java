package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSystemUserCompanyRole is a Querydsl query type for SystemUserCompanyRole
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSystemUserCompanyRole extends EntityPathBase<SystemUserCompanyRole> {

    private static final long serialVersionUID = -1365137443L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystemUserCompanyRole systemUserCompanyRole = new QSystemUserCompanyRole("systemUserCompanyRole");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QSystemUserCompanyRoleId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final QSystemUser systemUser;

    public QSystemUserCompanyRole(String variable) {
        this(SystemUserCompanyRole.class, forVariable(variable), INITS);
    }

    public QSystemUserCompanyRole(Path<? extends SystemUserCompanyRole> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSystemUserCompanyRole(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSystemUserCompanyRole(PathMetadata metadata, PathInits inits) {
        this(SystemUserCompanyRole.class, metadata, inits);
    }

    public QSystemUserCompanyRole(Class<? extends SystemUserCompanyRole> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QSystemUserCompanyRoleId(forProperty("id"), inits.get("id")) : null;
        this.systemUser = inits.isInitialized("systemUser") ? new QSystemUser(forProperty("systemUser"), inits.get("systemUser")) : null;
    }

}

