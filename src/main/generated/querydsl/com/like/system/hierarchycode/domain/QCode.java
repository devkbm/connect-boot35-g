package com.like.system.hierarchycode.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCode is a Querydsl query type for Code
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCode extends EntityPathBase<Code> {

    private static final long serialVersionUID = 1466068086L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCode code1 = new QCode("code1");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath _parentCode = createString("_parentCode");

    public final StringPath cmt = createString("cmt");

    public final StringPath code = createString("code");

    public final StringPath codeName = createString("codeName");

    public final StringPath codeNameAbbreviation = createString("codeNameAbbreviation");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final DateTimePath<java.time.LocalDateTime> fromDate = createDateTime("fromDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> hierarchyLevel = createNumber("hierarchyLevel", Integer.class);

    public final QCodeId id;

    public final NumberPath<Integer> lowLevelCodeLength = createNumber("lowLevelCodeLength", Integer.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final QCode parentCode;

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> toDate = createDateTime("toDate", java.time.LocalDateTime.class);

    public QCode(String variable) {
        this(Code.class, forVariable(variable), INITS);
    }

    public QCode(Path<? extends Code> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCode(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCode(PathMetadata metadata, PathInits inits) {
        this(Code.class, metadata, inits);
    }

    public QCode(Class<? extends Code> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QCodeId(forProperty("id")) : null;
        this.parentCode = inits.isInitialized("parentCode") ? new QCode(forProperty("parentCode"), inits.get("parentCode")) : null;
    }

    public BooleanExpression enabled() {
        return CodeExpression.enabled(this);
    }

    public BooleanExpression isLeafNode() {
        return CodeExpression.isLeafNode(this);
    }

    public BooleanExpression isRootNode() {
        return CodeExpression.isRootNode(this);
    }

}

