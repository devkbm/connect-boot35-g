package com.like.system.menu_role.domain.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QMenuGroupId is a Querydsl query type for MenuGroupId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QMenuGroupId extends BeanPath<MenuGroupId> {

    private static final long serialVersionUID = -1919204471L;

    public static final QMenuGroupId menuGroupId = new QMenuGroupId("menuGroupId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath menuGroupCode = createString("menuGroupCode");

    public QMenuGroupId(String variable) {
        super(MenuGroupId.class, forVariable(variable));
    }

    public QMenuGroupId(Path<? extends MenuGroupId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenuGroupId(PathMetadata metadata) {
        super(MenuGroupId.class, metadata);
    }

}

