package com.like.cooperation.board.domain.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostPassword is a Querydsl query type for PostPassword
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPostPassword extends BeanPath<PostPassword> {

    private static final long serialVersionUID = 1416511364L;

    public static final QPostPassword postPassword = new QPostPassword("postPassword");

    public final StringPath password = createString("password");

    public QPostPassword(String variable) {
        super(PostPassword.class, forVariable(variable));
    }

    public QPostPassword(Path<? extends PostPassword> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostPassword(PathMetadata metadata) {
        super(PostPassword.class, metadata);
    }

}

