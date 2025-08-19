package com.like.hrm.staff.domain.staff.schoolcareer;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffSchoolCareerId is a Querydsl query type for StaffSchoolCareerId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffSchoolCareerId extends BeanPath<StaffSchoolCareerId> {

    private static final long serialVersionUID = -2079713018L;

    public static final QStaffSchoolCareerId staffSchoolCareerId = new QStaffSchoolCareerId("staffSchoolCareerId");

    public final StringPath companyCode = createString("companyCode");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath staffNo = createString("staffNo");

    public QStaffSchoolCareerId(String variable) {
        super(StaffSchoolCareerId.class, forVariable(variable));
    }

    public QStaffSchoolCareerId(Path<? extends StaffSchoolCareerId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffSchoolCareerId(PathMetadata metadata) {
        super(StaffSchoolCareerId.class, metadata);
    }

}

