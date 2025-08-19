package com.like.system.hierarchycode.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QCodeId is a Querydsl query type for CodeId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCodeId extends BeanPath<CodeId> {

    private static final long serialVersionUID = 142159921L;

    public static final QCodeId codeId1 = new QCodeId("codeId1");

    public final StringPath codeId = createString("codeId");

    public final StringPath systemTypeCode = createString("systemTypeCode");

    public QCodeId(String variable) {
        super(CodeId.class, forVariable(variable));
    }

    public QCodeId(Path<? extends CodeId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCodeId(PathMetadata metadata) {
        super(CodeId.class, metadata);
    }

}

