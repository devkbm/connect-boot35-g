package com.like.common.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPhoneNumber is a Querydsl query type for PhoneNumber
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPhoneNumber extends BeanPath<PhoneNumber> {

    private static final long serialVersionUID = 1790724699L;

    public static final QPhoneNumber phoneNumber = new QPhoneNumber("phoneNumber");

    public final StringPath number = createString("number");

    public QPhoneNumber(String variable) {
        super(PhoneNumber.class, forVariable(variable));
    }

    public QPhoneNumber(Path<? extends PhoneNumber> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhoneNumber(PathMetadata metadata) {
        super(PhoneNumber.class, metadata);
    }

}

