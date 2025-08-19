package com.like.system.menu_role.domain.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenuId is a Querydsl query type for MenuId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QMenuId extends BeanPath<MenuId> {

    private static final long serialVersionUID = 1157982252L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuId menuId = new QMenuId("menuId");

    public final StringPath menuCode = createString("menuCode");

    public final QMenuGroupId menuGroupId;

    public QMenuId(String variable) {
        this(MenuId.class, forVariable(variable), INITS);
    }

    public QMenuId(Path<? extends MenuId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenuId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenuId(PathMetadata metadata, PathInits inits) {
        this(MenuId.class, metadata, inits);
    }

    public QMenuId(Class<? extends MenuId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.menuGroupId = inits.isInitialized("menuGroupId") ? new QMenuGroupId(forProperty("menuGroupId")) : null;
    }

}

