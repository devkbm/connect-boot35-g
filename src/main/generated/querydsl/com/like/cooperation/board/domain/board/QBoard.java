package com.like.cooperation.board.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;
import com.like.cooperation.board.adapter.out.db.querydsl.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -365147271L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard board = new QBoard("board");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final ListPath<com.like.cooperation.board.domain.post.Post, com.like.cooperation.board.domain.post.QPost> articles = this.<com.like.cooperation.board.domain.post.Post, com.like.cooperation.board.domain.post.QPost>createList("articles", com.like.cooperation.board.domain.post.Post.class, com.like.cooperation.board.domain.post.QPost.class, PathInits.DIRECT2);

    public final NumberPath<Long> boardId = createNumber("boardId", Long.class);

    public final StringPath boardName = createString("boardName");

    public final EnumPath<BoardType> boardType = createEnum("boardType", BoardType.class);

    public final SetPath<BoardBookmark, QBoardBookmark> bookmarks = this.<BoardBookmark, QBoardBookmark>createSet("bookmarks", BoardBookmark.class, QBoardBookmark.class, PathInits.DIRECT2);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath description = createString("description");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final QBoard parent;

    public final BooleanPath useYn = createBoolean("useYn");

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    public QBoard(Path<? extends Board> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard(PathMetadata metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QBoard(forProperty("parent"), inits.get("parent")) : null;
    }

    public BooleanExpression isRootNode() {
        return BoardExpression.isRootNode(this);
    }

}

