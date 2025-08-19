package com.like.hrm.staff.domain.staff.family;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffFamily is a Querydsl query type for StaffFamily
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaffFamily extends EntityPathBase<StaffFamily> {

    private static final long serialVersionUID = 97448143L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffFamily staffFamily = new QStaffFamily("staffFamily");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QStaffFamilyId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath name = createString("name");

    public final StringPath occupation = createString("occupation");

    public final StringPath relation = createString("relation");

    public final StringPath residentRegistrationNumber = createString("residentRegistrationNumber");

    public final StringPath schoolCareerType = createString("schoolCareerType");

    public final com.like.hrm.staff.domain.staff.QStaff staff;

    public QStaffFamily(String variable) {
        this(StaffFamily.class, forVariable(variable), INITS);
    }

    public QStaffFamily(Path<? extends StaffFamily> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaffFamily(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaffFamily(PathMetadata metadata, PathInits inits) {
        this(StaffFamily.class, metadata, inits);
    }

    public QStaffFamily(Class<? extends StaffFamily> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QStaffFamilyId(forProperty("id")) : null;
        this.staff = inits.isInitialized("staff") ? new com.like.hrm.staff.domain.staff.QStaff(forProperty("staff"), inits.get("staff")) : null;
    }

}

