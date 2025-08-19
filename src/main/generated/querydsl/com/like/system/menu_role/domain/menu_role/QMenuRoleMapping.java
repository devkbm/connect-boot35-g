package com.like.system.menu_role.domain.menu_role;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenuRoleMapping is a Querydsl query type for MenuRoleMapping
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenuRoleMapping extends EntityPathBase<MenuRoleMapping> {

    private static final long serialVersionUID = -2138090908L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuRoleMapping menuRoleMapping = new QMenuRoleMapping("menuRoleMapping");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QMenuRoleMappingId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public QMenuRoleMapping(String variable) {
        this(MenuRoleMapping.class, forVariable(variable), INITS);
    }

    public QMenuRoleMapping(Path<? extends MenuRoleMapping> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenuRoleMapping(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenuRoleMapping(PathMetadata metadata, PathInits inits) {
        this(MenuRoleMapping.class, metadata, inits);
    }

    public QMenuRoleMapping(Class<? extends MenuRoleMapping> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QMenuRoleMappingId(forProperty("id")) : null;
    }

}

