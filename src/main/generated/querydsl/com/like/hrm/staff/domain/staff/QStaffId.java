package com.like.hrm.staff.domain.staff;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffId is a Querydsl query type for StaffId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffId extends BeanPath<StaffId> {

    private static final long serialVersionUID = -1827218170L;

    public static final QStaffId staffId = new QStaffId("staffId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath staffNo = createString("staffNo");

    public QStaffId(String variable) {
        super(StaffId.class, forVariable(variable));
    }

    public QStaffId(Path<StaffId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffId(PathMetadata metadata) {
        super(StaffId.class, metadata);
    }

}

