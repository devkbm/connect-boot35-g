package com.like.hrm.staff.domain.staff.period;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffPeriodList is a Querydsl query type for StaffPeriodList
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffPeriodList extends BeanPath<StaffPeriodList> {

    private static final long serialVersionUID = 1094285895L;

    public static final QStaffPeriodList staffPeriodList = new QStaffPeriodList("staffPeriodList");

    public final SetPath<StaffPeriod, QStaffPeriod> periodList = this.<StaffPeriod, QStaffPeriod>createSet("periodList", StaffPeriod.class, QStaffPeriod.class, PathInits.DIRECT2);

    public QStaffPeriodList(String variable) {
        super(StaffPeriodList.class, forVariable(variable));
    }

    public QStaffPeriodList(Path<? extends StaffPeriodList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffPeriodList(PathMetadata metadata) {
        super(StaffPeriodList.class, metadata);
    }

}

