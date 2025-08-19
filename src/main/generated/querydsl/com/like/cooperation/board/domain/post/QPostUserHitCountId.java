package com.like.cooperation.board.domain.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostUserHitCountId is a Querydsl query type for PostUserHitCountId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPostUserHitCountId extends BeanPath<PostUserHitCountId> {

    private static final long serialVersionUID = 1446376395L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostUserHitCountId postUserHitCountId = new QPostUserHitCountId("postUserHitCountId");

    public final QPost article;

    public final StringPath userId = createString("userId");

    public QPostUserHitCountId(String variable) {
        this(PostUserHitCountId.class, forVariable(variable), INITS);
    }

    public QPostUserHitCountId(Path<? extends PostUserHitCountId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostUserHitCountId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostUserHitCountId(PathMetadata metadata, PathInits inits) {
        this(PostUserHitCountId.class, metadata, inits);
    }

    public QPostUserHitCountId(Class<? extends PostUserHitCountId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QPost(forProperty("article"), inits.get("article")) : null;
    }

}

