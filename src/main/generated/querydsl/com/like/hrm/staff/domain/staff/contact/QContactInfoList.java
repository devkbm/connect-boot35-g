package com.like.hrm.staff.domain.staff.contact;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QContactInfoList is a Querydsl query type for ContactInfoList
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QContactInfoList extends BeanPath<ContactInfoList> {

    private static final long serialVersionUID = -1828085815L;

    public static final QContactInfoList contactInfoList = new QContactInfoList("contactInfoList");

    public final SetPath<ContactInfo, QContactInfo> contactList = this.<ContactInfo, QContactInfo>createSet("contactList", ContactInfo.class, QContactInfo.class, PathInits.DIRECT2);

    public QContactInfoList(String variable) {
        super(ContactInfoList.class, forVariable(variable));
    }

    public QContactInfoList(Path<? extends ContactInfoList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContactInfoList(PathMetadata metadata) {
        super(ContactInfoList.class, metadata);
    }

}

