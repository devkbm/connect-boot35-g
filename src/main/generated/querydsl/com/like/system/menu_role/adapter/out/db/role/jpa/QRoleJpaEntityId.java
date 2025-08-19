package com.like.system.menu_role.adapter.out.db.role.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleJpaEntityId is a Querydsl query type for RoleJpaEntityId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QRoleJpaEntityId extends BeanPath<RoleJpaEntityId> {

    private static final long serialVersionUID = 1466442172L;

    public static final QRoleJpaEntityId roleJpaEntityId = new QRoleJpaEntityId("roleJpaEntityId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath roleCode = createString("roleCode");

    public QRoleJpaEntityId(String variable) {
        super(RoleJpaEntityId.class, forVariable(variable));
    }

    public QRoleJpaEntityId(Path<? extends RoleJpaEntityId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleJpaEntityId(PathMetadata metadata) {
        super(RoleJpaEntityId.class, metadata);
    }

}

