package com.like.cooperation.board.domain.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostContents is a Querydsl query type for PostContents
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPostContents extends BeanPath<PostContents> {

    private static final long serialVersionUID = -367796221L;

    public static final QPostContents postContents = new QPostContents("postContents");

    public final StringPath contents = createString("contents");

    public final StringPath title = createString("title");

    public QPostContents(String variable) {
        super(PostContents.class, forVariable(variable));
    }

    public QPostContents(Path<? extends PostContents> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostContents(PathMetadata metadata) {
        super(PostContents.class, metadata);
    }

}

