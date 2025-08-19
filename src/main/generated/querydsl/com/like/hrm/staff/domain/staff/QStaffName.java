package com.like.hrm.staff.domain.staff;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffName is a Querydsl query type for StaffName
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffName extends BeanPath<StaffName> {

    private static final long serialVersionUID = 685112246L;

    public static final QStaffName staffName = new QStaffName("staffName");

    public final StringPath name = createString("name");

    public final StringPath nameChi = createString("nameChi");

    public final StringPath nameEng = createString("nameEng");

    public QStaffName(String variable) {
        super(StaffName.class, forVariable(variable));
    }

    public QStaffName(Path<? extends StaffName> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffName(PathMetadata metadata) {
        super(StaffName.class, metadata);
    }

}

