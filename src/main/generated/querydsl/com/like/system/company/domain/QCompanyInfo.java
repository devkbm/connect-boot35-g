package com.like.system.company.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompanyInfo is a Querydsl query type for CompanyInfo
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCompanyInfo extends EntityPathBase<CompanyInfo> {

    private static final long serialVersionUID = 1232690471L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompanyInfo companyInfo = new QCompanyInfo("companyInfo");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final com.like.common.vo.QAddress businessLocation;

    public final StringPath businessRegistrationNumber = createString("businessRegistrationNumber");

    public final StringPath companyName = createString("companyName");

    public final StringPath coporationNumber = createString("coporationNumber");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final DatePath<java.time.LocalDate> establishmentDate = createDate("establishmentDate", java.time.LocalDate.class);

    public final com.like.common.vo.QAddress headOffice;

    public final QCompanyInfoId id;

    public final StringPath itemOfBusiness = createString("itemOfBusiness");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath nameOfCoRepresentative1 = createString("nameOfCoRepresentative1");

    public final StringPath nameOfCoRepresentative2 = createString("nameOfCoRepresentative2");

    public final StringPath nameOfRepresentative = createString("nameOfRepresentative");

    public final StringPath typeOfBusiness = createString("typeOfBusiness");

    public QCompanyInfo(String variable) {
        this(CompanyInfo.class, forVariable(variable), INITS);
    }

    public QCompanyInfo(Path<? extends CompanyInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompanyInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompanyInfo(PathMetadata metadata, PathInits inits) {
        this(CompanyInfo.class, metadata, inits);
    }

    public QCompanyInfo(Class<? extends CompanyInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.businessLocation = inits.isInitialized("businessLocation") ? new com.like.common.vo.QAddress(forProperty("businessLocation")) : null;
        this.headOffice = inits.isInitialized("headOffice") ? new com.like.common.vo.QAddress(forProperty("headOffice")) : null;
        this.id = inits.isInitialized("id") ? new QCompanyInfoId(forProperty("id")) : null;
    }

}

