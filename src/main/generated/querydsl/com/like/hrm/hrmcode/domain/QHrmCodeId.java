package com.like.hrm.hrmcode.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QHrmCodeId is a Querydsl query type for HrmCodeId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QHrmCodeId extends BeanPath<HrmCodeId> {

    private static final long serialVersionUID = 158204788L;

    public static final QHrmCodeId hrmCodeId = new QHrmCodeId("hrmCodeId");

    public final StringPath code = createString("code");

    public final StringPath typeId = createString("typeId");

    public QHrmCodeId(String variable) {
        super(HrmCodeId.class, forVariable(variable));
    }

    public QHrmCodeId(Path<? extends HrmCodeId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHrmCodeId(PathMetadata metadata) {
        super(HrmCodeId.class, metadata);
    }

}

