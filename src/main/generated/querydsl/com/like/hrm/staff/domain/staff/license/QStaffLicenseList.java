package com.like.hrm.staff.domain.staff.license;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffLicenseList is a Querydsl query type for StaffLicenseList
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffLicenseList extends BeanPath<StaffLicenseList> {

    private static final long serialVersionUID = 919186945L;

    public static final QStaffLicenseList staffLicenseList = new QStaffLicenseList("staffLicenseList");

    public final SetPath<StaffLicense, QStaffLicense> licenseList = this.<StaffLicense, QStaffLicense>createSet("licenseList", StaffLicense.class, QStaffLicense.class, PathInits.DIRECT2);

    public QStaffLicenseList(String variable) {
        super(StaffLicenseList.class, forVariable(variable));
    }

    public QStaffLicenseList(Path<? extends StaffLicenseList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffLicenseList(PathMetadata metadata) {
        super(StaffLicenseList.class, metadata);
    }

}

