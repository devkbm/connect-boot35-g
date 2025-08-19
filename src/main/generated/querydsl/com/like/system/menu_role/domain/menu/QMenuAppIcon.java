package com.like.system.menu_role.domain.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QMenuAppIcon is a Querydsl query type for MenuAppIcon
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QMenuAppIcon extends BeanPath<MenuAppIcon> {

    private static final long serialVersionUID = 1288051145L;

    public static final QMenuAppIcon menuAppIcon = new QMenuAppIcon("menuAppIcon");

    public final StringPath appIcon = createString("appIcon");

    public final StringPath appIconType = createString("appIconType");

    public QMenuAppIcon(String variable) {
        super(MenuAppIcon.class, forVariable(variable));
    }

    public QMenuAppIcon(Path<? extends MenuAppIcon> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMenuAppIcon(PathMetadata metadata) {
        super(MenuAppIcon.class, metadata);
    }

}

