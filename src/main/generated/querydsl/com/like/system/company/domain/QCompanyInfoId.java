package com.like.system.company.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QCompanyInfoId is a Querydsl query type for CompanyInfoId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCompanyInfoId extends BeanPath<CompanyInfoId> {

    private static final long serialVersionUID = -795428702L;

    public static final QCompanyInfoId companyInfoId = new QCompanyInfoId("companyInfoId");

    public final StringPath companyCode = createString("companyCode");

    public QCompanyInfoId(String variable) {
        super(CompanyInfoId.class, forVariable(variable));
    }

    public QCompanyInfoId(Path<? extends CompanyInfoId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompanyInfoId(PathMetadata metadata) {
        super(CompanyInfoId.class, metadata);
    }

}

