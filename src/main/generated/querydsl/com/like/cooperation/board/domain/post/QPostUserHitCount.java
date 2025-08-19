package com.like.cooperation.board.domain.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostUserHitCount is a Querydsl query type for PostUserHitCount
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostUserHitCount extends EntityPathBase<PostUserHitCount> {

    private static final long serialVersionUID = 1288654480L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostUserHitCount postUserHitCount = new QPostUserHitCount("postUserHitCount");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Integer> hitCount = createNumber("hitCount", Integer.class);

    public final QPostUserHitCountId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public QPostUserHitCount(String variable) {
        this(PostUserHitCount.class, forVariable(variable), INITS);
    }

    public QPostUserHitCount(Path<? extends PostUserHitCount> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostUserHitCount(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostUserHitCount(PathMetadata metadata, PathInits inits) {
        this(PostUserHitCount.class, metadata, inits);
    }

    public QPostUserHitCount(Class<? extends PostUserHitCount> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QPostUserHitCountId(forProperty("id"), inits.get("id")) : null;
    }

}

