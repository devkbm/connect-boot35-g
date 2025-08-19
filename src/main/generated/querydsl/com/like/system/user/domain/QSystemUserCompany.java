package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSystemUserCompany is a Querydsl query type for SystemUserCompany
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSystemUserCompany extends EntityPathBase<SystemUserCompany> {

    private static final long serialVersionUID = 1408069319L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystemUserCompany systemUserCompany = new QSystemUserCompany("systemUserCompany");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final com.like.system.dept.domain.QDept dept;

    public final StringPath deptCode = createString("deptCode");

    public final QSystemUserCompanyId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final QSystemUser systemUser;

    public final BooleanPath useYn = createBoolean("useYn");

    public QSystemUserCompany(String variable) {
        this(SystemUserCompany.class, forVariable(variable), INITS);
    }

    public QSystemUserCompany(Path<? extends SystemUserCompany> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSystemUserCompany(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSystemUserCompany(PathMetadata metadata, PathInits inits) {
        this(SystemUserCompany.class, metadata, inits);
    }

    public QSystemUserCompany(Class<? extends SystemUserCompany> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dept = inits.isInitialized("dept") ? new com.like.system.dept.domain.QDept(forProperty("dept"), inits.get("dept")) : null;
        this.id = inits.isInitialized("id") ? new QSystemUserCompanyId(forProperty("id"), inits.get("id")) : null;
        this.systemUser = inits.isInitialized("systemUser") ? new QSystemUser(forProperty("systemUser"), inits.get("systemUser")) : null;
    }

}

