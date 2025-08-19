package com.like.hrm.staff.domain.staff.period;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffPeriodId is a Querydsl query type for StaffPeriodId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffPeriodId extends BeanPath<StaffPeriodId> {

    private static final long serialVersionUID = 407842052L;

    public static final QStaffPeriodId staffPeriodId = new QStaffPeriodId("staffPeriodId");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath periodType = createString("periodType");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath staffNo = createString("staffNo");

    public QStaffPeriodId(String variable) {
        super(StaffPeriodId.class, forVariable(variable));
    }

    public QStaffPeriodId(Path<? extends StaffPeriodId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffPeriodId(PathMetadata metadata) {
        super(StaffPeriodId.class, metadata);
    }

}

