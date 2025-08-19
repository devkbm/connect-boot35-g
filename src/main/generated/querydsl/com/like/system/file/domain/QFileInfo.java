package com.like.system.file.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QFileInfo is a Querydsl query type for FileInfo
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFileInfo extends EntityPathBase<FileInfo> {

    private static final long serialVersionUID = 135814455L;

    public static final QFileInfo fileInfo = new QFileInfo("fileInfo");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath appUrl = createString("appUrl");

    public final StringPath contentType = createString("contentType");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> downloadCount = createNumber("downloadCount", Long.class);

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath path = createString("path");

    public final NumberPath<Long> size = createNumber("size", Long.class);

    public final StringPath userId = createString("userId");

    public final StringPath uuid = createString("uuid");

    public QFileInfo(String variable) {
        super(FileInfo.class, forVariable(variable));
    }

    public QFileInfo(Path<? extends FileInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileInfo(PathMetadata metadata) {
        super(FileInfo.class, metadata);
    }

}

