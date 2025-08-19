package com.like.hrm.staff.domain.staff.license;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffLicense is a Querydsl query type for StaffLicense
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaffLicense extends EntityPathBase<StaffLicense> {

    private static final long serialVersionUID = 1443537603L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffLicense staffLicense = new QStaffLicense("staffLicense");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath certificationAuthority = createString("certificationAuthority");

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final DatePath<java.time.LocalDate> dateOfAcquisition = createDate("dateOfAcquisition", java.time.LocalDate.class);

    public final QStaffLicenseId id;

    public final StringPath licenseNumber = createString("licenseNumber");

    public final StringPath licenseType = createString("licenseType");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final com.like.hrm.staff.domain.staff.QStaff staff;

    public QStaffLicense(String variable) {
        this(StaffLicense.class, forVariable(variable), INITS);
    }

    public QStaffLicense(Path<? extends StaffLicense> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaffLicense(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaffLicense(PathMetadata metadata, PathInits inits) {
        this(StaffLicense.class, metadata, inits);
    }

    public QStaffLicense(Class<? extends StaffLicense> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QStaffLicenseId(forProperty("id")) : null;
        this.staff = inits.isInitialized("staff") ? new com.like.hrm.staff.domain.staff.QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

