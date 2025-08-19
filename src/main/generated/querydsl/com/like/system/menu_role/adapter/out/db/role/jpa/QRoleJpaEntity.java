package com.like.system.menu_role.adapter.out.db.role.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleJpaEntity is a Querydsl query type for RoleJpaEntity
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleJpaEntity extends EntityPathBase<RoleJpaEntity> {

    private static final long serialVersionUID = -1209645887L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoleJpaEntity roleJpaEntity = new QRoleJpaEntity("roleJpaEntity");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath description = createString("description");

    public final QRoleJpaEntityId id;

    public final StringPath menuGroupCode = createString("menuGroupCode");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath roleName = createString("roleName");

    public QRoleJpaEntity(String variable) {
        this(RoleJpaEntity.class, forVariable(variable), INITS);
    }

    public QRoleJpaEntity(Path<? extends RoleJpaEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoleJpaEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoleJpaEntity(PathMetadata metadata, PathInits inits) {
        this(RoleJpaEntity.class, metadata, inits);
    }

    public QRoleJpaEntity(Class<? extends RoleJpaEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QRoleJpaEntityId(forProperty("id")) : null;
    }

}

