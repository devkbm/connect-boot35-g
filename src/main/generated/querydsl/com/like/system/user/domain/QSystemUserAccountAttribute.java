package com.like.system.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QSystemUserAccountAttribute is a Querydsl query type for SystemUserAccountAttribute
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSystemUserAccountAttribute extends BeanPath<SystemUserAccountAttribute> {

    private static final long serialVersionUID = -864607259L;

    public static final QSystemUserAccountAttribute systemUserAccountAttribute = new QSystemUserAccountAttribute("systemUserAccountAttribute");

    public final BooleanPath isAccountNonExpired = createBoolean("isAccountNonExpired");

    public final BooleanPath isAccountNonLocked = createBoolean("isAccountNonLocked");

    public final BooleanPath isCredentialsNonExpired = createBoolean("isCredentialsNonExpired");

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public QSystemUserAccountAttribute(String variable) {
        super(SystemUserAccountAttribute.class, forVariable(variable));
    }

    public QSystemUserAccountAttribute(Path<? extends SystemUserAccountAttribute> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemUserAccountAttribute(PathMetadata metadata) {
        super(SystemUserAccountAttribute.class, metadata);
    }

}

