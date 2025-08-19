package com.like.hrm.staff.domain.staff.contact;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QContactInfoId is a Querydsl query type for ContactInfoId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QContactInfoId extends BeanPath<ContactInfoId> {

    private static final long serialVersionUID = 999213830L;

    public static final QContactInfoId contactInfoId = new QContactInfoId("contactInfoId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath staffNo = createString("staffNo");

    public final StringPath type = createString("type");

    public QContactInfoId(String variable) {
        super(ContactInfoId.class, forVariable(variable));
    }

    public QContactInfoId(Path<? extends ContactInfoId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContactInfoId(PathMetadata metadata) {
        super(ContactInfoId.class, metadata);
    }

}

