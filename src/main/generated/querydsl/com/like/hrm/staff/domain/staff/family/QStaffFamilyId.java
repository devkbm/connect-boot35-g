package com.like.hrm.staff.domain.staff.family;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffFamilyId is a Querydsl query type for StaffFamilyId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffFamilyId extends BeanPath<StaffFamilyId> {

    private static final long serialVersionUID = -841612726L;

    public static final QStaffFamilyId staffFamilyId = new QStaffFamilyId("staffFamilyId");

    public final StringPath companyCode = createString("companyCode");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath staffNo = createString("staffNo");

    public QStaffFamilyId(String variable) {
        super(StaffFamilyId.class, forVariable(variable));
    }

    public QStaffFamilyId(Path<? extends StaffFamilyId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffFamilyId(PathMetadata metadata) {
        super(StaffFamilyId.class, metadata);
    }

}

