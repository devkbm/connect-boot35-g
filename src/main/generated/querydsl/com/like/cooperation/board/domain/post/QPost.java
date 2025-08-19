package com.like.cooperation.board.domain.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPost is a Querydsl query type for Post
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPost extends EntityPathBase<Post> {

    private static final long serialVersionUID = 1431828937L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPost post = new QPost("post");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final com.like.cooperation.board.domain.board.QBoard board;

    public final QPostContents content;

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Integer> depth = createNumber("depth", Integer.class);

    public final ListPath<PostAttachedFile, QPostAttachedFile> files = this.<PostAttachedFile, QPostAttachedFile>createList("files", PostAttachedFile.class, QPostAttachedFile.class, PathInits.DIRECT2);

    public final NumberPath<Integer> hitCount = createNumber("hitCount", Integer.class);

    public final BooleanPath isFixedTop = createBoolean("isFixedTop");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final QPostPassword password;

    public final NumberPath<Long> postId = createNumber("postId", Long.class);

    public final NumberPath<Long> postParentId = createNumber("postParentId", Long.class);

    public final StringPath userId = createString("userId");

    public QPost(String variable) {
        this(Post.class, forVariable(variable), INITS);
    }

    public QPost(Path<? extends Post> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPost(PathMetadata metadata, PathInits inits) {
        this(Post.class, metadata, inits);
    }

    public QPost(Class<? extends Post> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new com.like.cooperation.board.domain.board.QBoard(forProperty("board"), inits.get("board")) : null;
        this.content = inits.isInitialized("content") ? new QPostContents(forProperty("content")) : null;
        this.password = inits.isInitialized("password") ? new QPostPassword(forProperty("password")) : null;
    }

}

