package com.like.cooperation.board.domain.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostAttachedFile is a Querydsl query type for PostAttachedFile
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostAttachedFile extends EntityPathBase<PostAttachedFile> {

    private static final long serialVersionUID = 1737776553L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostAttachedFile postAttachedFile = new QPostAttachedFile("postAttachedFile");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath contentType = createString("contentType");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> fileInfo = createNumber("fileInfo", Long.class);

    public final StringPath fileName = createString("fileName");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath path = createString("path");

    public final QPost post;

    public final NumberPath<Long> postFileId = createNumber("postFileId", Long.class);

    public final NumberPath<Long> size = createNumber("size", Long.class);

    public final StringPath uuid = createString("uuid");

    public QPostAttachedFile(String variable) {
        this(PostAttachedFile.class, forVariable(variable), INITS);
    }

    public QPostAttachedFile(Path<? extends PostAttachedFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostAttachedFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostAttachedFile(PathMetadata metadata, PathInits inits) {
        this(PostAttachedFile.class, metadata, inits);
    }

    public QPostAttachedFile(Class<? extends PostAttachedFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.post = inits.isInitialized("post") ? new QPost(forProperty("post"), inits.get("post")) : null;
    }

}

