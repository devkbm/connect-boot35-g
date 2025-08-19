package com.like.system.menu_role.domain.menu_role;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QMenuRoleMappingId is a Querydsl query type for MenuRoleMappingId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QMenuRoleMappingId extends BeanPath<MenuRoleMappingId> {

    private static final long serialVersionUID = -1710992737L;

    public static final QMenuRoleMappingId menuRoleMappingId = new QMenuRoleMappingId("menuRoleMappingId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath menuCode = createString("menuCode");

    public final StringPath menuGroupCode = createString("menuGroupCode");

    public final StringPath roleCode = createString("roleCode");

    public QMenuRoleMappingId(String variable) {
        super(MenuRoleMappingId.class, forVariable(variable));
    }

    public QMenuRoleMappingId(Path<? extends MenuRoleMappingId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenuRoleMappingId(PathMetadata metadata) {
        super(MenuRoleMappingId.class, metadata);
    }

}

