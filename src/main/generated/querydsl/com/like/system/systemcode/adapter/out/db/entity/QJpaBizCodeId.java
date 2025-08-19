package com.like.system.systemcode.adapter.out.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaBizCodeId is a Querydsl query type for JpaBizCodeId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QJpaBizCodeId extends BeanPath<JpaBizCodeId> {

    private static final long serialVersionUID = 1343504791L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaBizCodeId jpaBizCodeId = new QJpaBizCodeId("jpaBizCodeId");

    public final QJpaBizCodeTypeId bizCodeTypeId;

    public final StringPath code = createString("code");

    public QJpaBizCodeId(String variable) {
        this(JpaBizCodeId.class, forVariable(variable), INITS);
    }

    public QJpaBizCodeId(Path<? extends JpaBizCodeId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaBizCodeId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaBizCodeId(PathMetadata metadata, PathInits inits) {
        this(JpaBizCodeId.class, metadata, inits);
    }

    public QJpaBizCodeId(Class<? extends JpaBizCodeId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bizCodeTypeId = inits.isInitialized("bizCodeTypeId") ? new QJpaBizCodeTypeId(forProperty("bizCodeTypeId")) : null;
    }

}

