package com.like.system.systemcode.adapter.out.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaBizCode is a Querydsl query type for JpaBizCode
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QJpaBizCode extends EntityPathBase<JpaBizCode> {

    private static final long serialVersionUID = -1522622628L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaBizCode jpaBizCode = new QJpaBizCode("jpaBizCode");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final QJpaBizCodeType bizCodeType;

    public final StringPath codeName = createString("codeName");

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QJpaBizCodeId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final BooleanPath useYn = createBoolean("useYn");

    public QJpaBizCode(String variable) {
        this(JpaBizCode.class, forVariable(variable), INITS);
    }

    public QJpaBizCode(Path<? extends JpaBizCode> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaBizCode(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaBizCode(PathMetadata metadata, PathInits inits) {
        this(JpaBizCode.class, metadata, inits);
    }

    public QJpaBizCode(Class<? extends JpaBizCode> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bizCodeType = inits.isInitialized("bizCodeType") ? new QJpaBizCodeType(forProperty("bizCodeType"), inits.get("bizCodeType")) : null;
        this.id = inits.isInitialized("id") ? new QJpaBizCodeId(forProperty("id"), inits.get("id")) : null;
    }

}

