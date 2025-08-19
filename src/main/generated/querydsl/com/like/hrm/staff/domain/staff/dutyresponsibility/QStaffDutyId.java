package com.like.hrm.staff.domain.staff.dutyresponsibility;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffDutyId is a Querydsl query type for StaffDutyId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffDutyId extends BeanPath<StaffDutyId> {

    private static final long serialVersionUID = -1119091844L;

    public static final QStaffDutyId staffDutyId = new QStaffDutyId("staffDutyId");

    public final StringPath companyCode = createString("companyCode");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath staffNo = createString("staffNo");

    public QStaffDutyId(String variable) {
        super(StaffDutyId.class, forVariable(variable));
    }

    public QStaffDutyId(Path<? extends StaffDutyId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffDutyId(PathMetadata metadata) {
        super(StaffDutyId.class, metadata);
    }

}

