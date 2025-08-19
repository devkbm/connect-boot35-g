package com.like.cooperation.board.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardBookmark is a Querydsl query type for BoardBookmark
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardBookmark extends EntityPathBase<BoardBookmark> {

    private static final long serialVersionUID = -1971598385L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardBookmark boardBookmark = new QBoardBookmark("boardBookmark");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final QBoard board;

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final NumberPath<Long> pkBookmark = createNumber("pkBookmark", Long.class);

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath userId = createString("userId");

    public QBoardBookmark(String variable) {
        this(BoardBookmark.class, forVariable(variable), INITS);
    }

    public QBoardBookmark(Path<? extends BoardBookmark> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardBookmark(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardBookmark(PathMetadata metadata, PathInits inits) {
        this(BoardBookmark.class, metadata, inits);
    }

    public QBoardBookmark(Class<? extends BoardBookmark> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
    }

}

