package com.like.hrm.staff.domain.staff.contact;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContactInfo is a Querydsl query type for ContactInfo
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QContactInfo extends EntityPathBase<ContactInfo> {

    private static final long serialVersionUID = -1487226741L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QContactInfo contactInfo = new QContactInfo("contactInfo");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final com.like.common.vo.QAddress address;

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QContactInfoId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final com.like.common.vo.QPhoneNumber phoneNumber;

    public final com.like.hrm.staff.domain.staff.QStaff staff;

    public QContactInfo(String variable) {
        this(ContactInfo.class, forVariable(variable), INITS);
    }

    public QContactInfo(Path<? extends ContactInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QContactInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QContactInfo(PathMetadata metadata, PathInits inits) {
        this(ContactInfo.class, metadata, inits);
    }

    public QContactInfo(Class<? extends ContactInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new com.like.common.vo.QAddress(forProperty("address")) : null;
        this.id = inits.isInitialized("id") ? new QContactInfoId(forProperty("id")) : null;
        this.phoneNumber = inits.isInitialized("phoneNumber") ? new com.like.common.vo.QPhoneNumber(forProperty("phoneNumber")) : null;
        this.staff = inits.isInitialized("staff") ? new com.like.hrm.staff.domain.staff.QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

