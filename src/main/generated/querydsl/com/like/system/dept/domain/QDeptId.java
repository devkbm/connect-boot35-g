package com.like.system.dept.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QDeptId is a Querydsl query type for DeptId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QDeptId extends BeanPath<DeptId> {

    private static final long serialVersionUID = -1746599050L;

    public static final QDeptId deptId = new QDeptId("deptId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath deptCode = createString("deptCode");

    public QDeptId(String variable) {
        super(DeptId.class, forVariable(variable));
    }

    public QDeptId(Path<? extends DeptId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDeptId(PathMetadata metadata) {
        super(DeptId.class, metadata);
    }

}

