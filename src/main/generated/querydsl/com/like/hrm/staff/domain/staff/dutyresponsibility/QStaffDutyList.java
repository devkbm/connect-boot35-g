package com.like.hrm.staff.domain.staff.dutyresponsibility;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffDutyList is a Querydsl query type for StaffDutyList
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffDutyList extends BeanPath<StaffDutyList> {

    private static final long serialVersionUID = -1705340225L;

    public static final QStaffDutyList staffDutyList1 = new QStaffDutyList("staffDutyList1");

    public final SetPath<StaffDuty, QStaffDuty> staffDutyList = this.<StaffDuty, QStaffDuty>createSet("staffDutyList", StaffDuty.class, QStaffDuty.class, PathInits.DIRECT2);

    public QStaffDutyList(String variable) {
        super(StaffDutyList.class, forVariable(variable));
    }

    public QStaffDutyList(Path<? extends StaffDutyList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffDutyList(PathMetadata metadata) {
        super(StaffDutyList.class, metadata);
    }

}

