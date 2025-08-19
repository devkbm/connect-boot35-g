package com.like.hrm.staff.domain.staff.schoolcareer;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffSchoolCareerList is a Querydsl query type for StaffSchoolCareerList
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QStaffSchoolCareerList extends BeanPath<StaffSchoolCareerList> {

    private static final long serialVersionUID = -1444319799L;

    public static final QStaffSchoolCareerList staffSchoolCareerList = new QStaffSchoolCareerList("staffSchoolCareerList");

    public final SetPath<StaffSchoolCareer, QStaffSchoolCareer> schoolCareerList = this.<StaffSchoolCareer, QStaffSchoolCareer>createSet("schoolCareerList", StaffSchoolCareer.class, QStaffSchoolCareer.class, PathInits.DIRECT2);

    public QStaffSchoolCareerList(String variable) {
        super(StaffSchoolCareerList.class, forVariable(variable));
    }

    public QStaffSchoolCareerList(Path<? extends StaffSchoolCareerList> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffSchoolCareerList(PathMetadata metadata) {
        super(StaffSchoolCareerList.class, metadata);
    }

}

