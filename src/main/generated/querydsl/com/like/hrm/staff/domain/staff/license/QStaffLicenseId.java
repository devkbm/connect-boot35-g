package com.like.hrm.staff.domain.staff.license;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffLicenseId is a Querydsl query type for StaffLicenseId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffLicenseId extends BeanPath<StaffLicenseId> {

    private static final long serialVersionUID = -34797762L;

    public static final QStaffLicenseId staffLicenseId = new QStaffLicenseId("staffLicenseId");

    public final StringPath companyCode = createString("companyCode");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath staffNo = createString("staffNo");

    public QStaffLicenseId(String variable) {
        super(StaffLicenseId.class, forVariable(variable));
    }

    public QStaffLicenseId(Path<? extends StaffLicenseId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffLicenseId(PathMetadata metadata) {
        super(StaffLicenseId.class, metadata);
    }

}

