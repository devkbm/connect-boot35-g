package com.like.system.menu_role.domain.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenuGroup is a Querydsl query type for MenuGroup
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenuGroup extends EntityPathBase<MenuGroup> {

    private static final long serialVersionUID = 270628302L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuGroup menuGroup = new QMenuGroup("menuGroup");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath description = createString("description");

    public final QMenuGroupId id;

    public final StringPath menuGroupUrl = createString("menuGroupUrl");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath name = createString("name");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public QMenuGroup(String variable) {
        this(MenuGroup.class, forVariable(variable), INITS);
    }

    public QMenuGroup(Path<? extends MenuGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenuGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenuGroup(PathMetadata metadata, PathInits inits) {
        this(MenuGroup.class, metadata, inits);
    }

    public QMenuGroup(Class<? extends MenuGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QMenuGroupId(forProperty("id")) : null;
    }

}

