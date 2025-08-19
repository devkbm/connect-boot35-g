package com.like.hrm.payitem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayItemId is a Querydsl query type for PayItemId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPayItemId extends BeanPath<PayItemId> {

    private static final long serialVersionUID = 1340788756L;

    public static final QPayItemId payItemId = new QPayItemId("payItemId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath itemCode = createString("itemCode");

    public QPayItemId(String variable) {
        super(PayItemId.class, forVariable(variable));
    }

    public QPayItemId(Path<? extends PayItemId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayItemId(PathMetadata metadata) {
        super(PayItemId.class, metadata);
    }

}

