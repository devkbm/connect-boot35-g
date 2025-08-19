package com.like.hrm.anualleave.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnualLeaveId is a Querydsl query type for AnualLeaveId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAnualLeaveId extends BeanPath<AnualLeaveId> {

    private static final long serialVersionUID = -1010172647L;

    public static final QAnualLeaveId anualLeaveId = new QAnualLeaveId("anualLeaveId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath staffNo = createString("staffNo");

    public final NumberPath<Integer> yyyy = createNumber("yyyy", Integer.class);

    public QAnualLeaveId(String variable) {
        super(AnualLeaveId.class, forVariable(variable));
    }

    public QAnualLeaveId(Path<? extends AnualLeaveId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnualLeaveId(PathMetadata metadata) {
        super(AnualLeaveId.class, metadata);
    }

}

