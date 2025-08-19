package com.like.hrm.staff.domain.staff.schoolcareer;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffSchoolCareer is a Querydsl query type for StaffSchoolCareer
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaffSchoolCareer extends EntityPathBase<StaffSchoolCareer> {

    private static final long serialVersionUID = -766409077L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffSchoolCareer staffSchoolCareer = new QStaffSchoolCareer("staffSchoolCareer");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QStaffSchoolCareerId id;

    public final NumberPath<Integer> lessonYear = createNumber("lessonYear", Integer.class);

    public final StringPath location = createString("location");

    public final StringPath majorName = createString("majorName");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final com.like.common.vo.QLocalDatePeriod period;

    public final StringPath pluralMajorName = createString("pluralMajorName");

    public final StringPath schoolCareerType = createString("schoolCareerType");

    public final StringPath schoolCode = createString("schoolCode");

    public final com.like.hrm.staff.domain.staff.QStaff staff;

    public QStaffSchoolCareer(String variable) {
        this(StaffSchoolCareer.class, forVariable(variable), INITS);
    }

    public QStaffSchoolCareer(Path<? extends StaffSchoolCareer> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaffSchoolCareer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaffSchoolCareer(PathMetadata metadata, PathInits inits) {
        this(StaffSchoolCareer.class, metadata, inits);
    }

    public QStaffSchoolCareer(Class<? extends StaffSchoolCareer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QStaffSchoolCareerId(forProperty("id")) : null;
        this.period = inits.isInitialized("period") ? new com.like.common.vo.QLocalDatePeriod(forProperty("period")) : null;
        this.staff = inits.isInitialized("staff") ? new com.like.hrm.staff.domain.staff.QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

