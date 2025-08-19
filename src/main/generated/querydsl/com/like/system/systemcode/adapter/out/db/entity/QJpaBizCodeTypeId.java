package com.like.system.systemcode.adapter.out.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QJpaBizCodeTypeId is a Querydsl query type for JpaBizCodeTypeId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QJpaBizCodeTypeId extends BeanPath<JpaBizCodeTypeId> {

    private static final long serialVersionUID = -696432527L;

    public static final QJpaBizCodeTypeId jpaBizCodeTypeId = new QJpaBizCodeTypeId("jpaBizCodeTypeId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath typeId = createString("typeId");

    public QJpaBizCodeTypeId(String variable) {
        super(JpaBizCodeTypeId.class, forVariable(variable));
    }

    public QJpaBizCodeTypeId(Path<? extends JpaBizCodeTypeId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaBizCodeTypeId(PathMetadata metadata) {
        super(JpaBizCodeTypeId.class, metadata);
    }

}

