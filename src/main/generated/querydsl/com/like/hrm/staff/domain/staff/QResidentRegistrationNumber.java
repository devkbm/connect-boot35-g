package com.like.hrm.staff.domain.staff;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QResidentRegistrationNumber is a Querydsl query type for ResidentRegistrationNumber
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QResidentRegistrationNumber extends BeanPath<ResidentRegistrationNumber> {

    private static final long serialVersionUID = 521558023L;

    public static final QResidentRegistrationNumber residentRegistrationNumber = new QResidentRegistrationNumber("residentRegistrationNumber");

    public final StringPath number = createString("number");

    public QResidentRegistrationNumber(String variable) {
        super(ResidentRegistrationNumber.class, forVariable(variable));
    }

    public QResidentRegistrationNumber(Path<? extends ResidentRegistrationNumber> path) {
        super(path.getType(), path.getMetadata());
    }

    public QResidentRegistrationNumber(PathMetadata metadata) {
        super(ResidentRegistrationNumber.class, metadata);
    }

}

