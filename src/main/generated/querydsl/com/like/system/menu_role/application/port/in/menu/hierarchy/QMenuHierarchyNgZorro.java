package com.like.system.menu_role.application.port.in.menu.hierarchy;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.annotations.Generated;

/**
 * com.like.system.menu_role.application.port.in.menu.hierarchy.QMenuHierarchyNgZorro is a Querydsl Projection type for MenuHierarchyNgZorro
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMenuHierarchyNgZorro extends ConstructorExpression<MenuHierarchyNgZorro> {

    private static final long serialVersionUID = -1055592660L;

    public QMenuHierarchyNgZorro(com.querydsl.core.types.Expression<String> key, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> menuGroupCode, com.querydsl.core.types.Expression<String> parentMenuCode, com.querydsl.core.types.Expression<com.like.system.menu_role.domain.menu.MenuType> menuType, com.querydsl.core.types.Expression<Long> sequence, com.querydsl.core.types.Expression<Long> level, com.querydsl.core.types.Expression<String> url, com.querydsl.core.types.Expression<String> icon) {
        super(MenuHierarchyNgZorro.class, new Class<?>[]{String.class, String.class, String.class, String.class, com.like.system.menu_role.domain.menu.MenuType.class, long.class, long.class, String.class, String.class}, key, title, menuGroupCode, parentMenuCode, menuType, sequence, level, url, icon);
    }

}

