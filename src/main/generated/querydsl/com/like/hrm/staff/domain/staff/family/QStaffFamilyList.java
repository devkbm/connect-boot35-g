package com.like.hrm.staff.domain.staff.family;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffFamilyList is a Querydsl query type for StaffFamilyList
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffFamilyList extends BeanPath<StaffFamilyList> {

    private static final long serialVersionUID = -1335880179L;

    public static final QStaffFamilyList staffFamilyList = new QStaffFamilyList("staffFamilyList");

    public final SetPath<StaffFamily, QStaffFamily> familyList = this.<StaffFamily, QStaffFamily>createSet("familyList", StaffFamily.class, QStaffFamily.class, PathInits.DIRECT2);

    public QStaffFamilyList(String variable) {
        super(StaffFamilyList.class, forVariable(variable));
    }

    public QStaffFamilyList(Path<? extends StaffFamilyList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffFamilyList(PathMetadata metadata) {
        super(StaffFamilyList.class, metadata);
    }

}

