package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSystemUser is a Querydsl query type for SystemUser
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSystemUser extends EntityPathBase<SystemUser> {

    private static final long serialVersionUID = -1411847978L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSystemUser systemUser = new QSystemUser("systemUser");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final QSystemUserAccountAttribute accountSpec;

    public final SetPath<SystemUserCompany, QSystemUserCompany> company = this.<SystemUserCompany, QSystemUserCompany>createSet("company", SystemUserCompany.class, QSystemUserCompany.class, PathInits.DIRECT2);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath email = createString("email");

    public final QSystemUserId id;

    public final QSystemUserProfilePicture image;

    public final StringPath mobileNum = createString("mobileNum");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath name = createString("name");

    public final QSystemUserPassword password;

    public final SetPath<SystemUserCompanyRole, QSystemUserCompanyRole> roles = this.<SystemUserCompanyRole, QSystemUserCompanyRole>createSet("roles", SystemUserCompanyRole.class, QSystemUserCompanyRole.class, PathInits.DIRECT2);

    public QSystemUser(String variable) {
        this(SystemUser.class, forVariable(variable), INITS);
    }

    public QSystemUser(Path<? extends SystemUser> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSystemUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSystemUser(PathMetadata metadata, PathInits inits) {
        this(SystemUser.class, metadata, inits);
    }

    public QSystemUser(Class<? extends SystemUser> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.accountSpec = inits.isInitialized("accountSpec") ? new QSystemUserAccountAttribute(forProperty("accountSpec")) : null;
        this.id = inits.isInitialized("id") ? new QSystemUserId(forProperty("id")) : null;
        this.image = inits.isInitialized("image") ? new QSystemUserProfilePicture(forProperty("image")) : null;
        this.password = inits.isInitialized("password") ? new QSystemUserPassword(forProperty("password")) : null;
    }

}

