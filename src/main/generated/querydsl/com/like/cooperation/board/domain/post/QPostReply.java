package com.like.cooperation.board.domain.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostReply is a Querydsl query type for PostReply
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostReply extends EntityPathBase<PostReply> {

    private static final long serialVersionUID = -1418928479L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostReply postReply = new QPostReply("postReply");

    public final QPost article;

    public final NumberPath<Long> articleReplyId = createNumber("articleReplyId", Long.class);

    public final NumberPath<Long> articleReplyParentId = createNumber("articleReplyParentId", Long.class);

    public final StringPath contents = createString("contents");

    public final StringPath userId = createString("userId");

    public QPostReply(String variable) {
        this(PostReply.class, forVariable(variable), INITS);
    }

    public QPostReply(Path<? extends PostReply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostReply(PathMetadata metadata, PathInits inits) {
        this(PostReply.class, metadata, inits);
    }

    public QPostReply(Class<? extends PostReply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QPost(forProperty("article"), inits.get("article")) : null;
    }

}

