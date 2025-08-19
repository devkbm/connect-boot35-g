package com.like.hrm.staff.domain.partner;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPartnerCompanyStaff is a Querydsl query type for PartnerCompanyStaff
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPartnerCompanyStaff extends EntityPathBase<PartnerCompanyStaff> {

    private static final long serialVersionUID = -2091928226L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPartnerCompanyStaff partnerCompanyStaff = new QPartnerCompanyStaff("partnerCompanyStaff");

    public final DatePath<java.time.LocalDate> birthday = createDate("birthday", java.time.LocalDate.class);

    public final StringPath blngDeptCode = createString("blngDeptCode");

    public final StringPath gender = createString("gender");

    public final com.like.hrm.staff.domain.staff.QStaffId id;

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath isStaff = createBoolean("isStaff");

    public final DatePath<java.time.LocalDate> joinDate = createDate("joinDate", java.time.LocalDate.class);

    public final com.like.hrm.staff.domain.staff.QStaffName name;

    public final StringPath partnerCompanyCode = createString("partnerCompanyCode");

    public final com.like.hrm.staff.domain.staff.QResidentRegistrationNumber residentRegistrationNumber;

    public final DatePath<java.time.LocalDate> retireDate = createDate("retireDate", java.time.LocalDate.class);

    public final StringPath workDeptCode = createString("workDeptCode");

    public final StringPath workStateCode = createString("workStateCode");

    public QPartnerCompanyStaff(String variable) {
        this(PartnerCompanyStaff.class, forVariable(variable), INITS);
    }

    public QPartnerCompanyStaff(Path<? extends PartnerCompanyStaff> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPartnerCompanyStaff(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPartnerCompanyStaff(PathMetadata metadata, PathInits inits) {
        this(PartnerCompanyStaff.class, metadata, inits);
    }

    public QPartnerCompanyStaff(Class<? extends PartnerCompanyStaff> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new com.like.hrm.staff.domain.staff.QStaffId(forProperty("id")) : null;
        this.name = inits.isInitialized("name") ? new com.like.hrm.staff.domain.staff.QStaffName(forProperty("name")) : null;
        this.residentRegistrationNumber = inits.isInitialized("residentRegistrationNumber") ? new com.like.hrm.staff.domain.staff.QResidentRegistrationNumber(forProperty("residentRegistrationNumber")) : null;
    }

}

