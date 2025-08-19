package com.like.hrm.staff.domain.staff;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaff is a Querydsl query type for Staff
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaff extends EntityPathBase<Staff> {

    private static final long serialVersionUID = 96422539L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaff staff = new QStaff("staff");

    public final com.like.hrm.staff.domain.staff.appointment.QAppointmentRecordList appointmentRecordList;

    public final DatePath<java.time.LocalDate> birthday = createDate("birthday", java.time.LocalDate.class);

    public final com.like.hrm.staff.domain.staff.contact.QContactInfoList contactInfoList;

    public final QCurrentAppointmentInformation currentAppointment;

    public final com.like.hrm.staff.domain.staff.family.QStaffFamilyList familyList;

    public final StringPath gender = createString("gender");

    public final QStaffId id;

    public final StringPath imagePath = createString("imagePath");

    public final BooleanPath isStaff = createBoolean("isStaff");

    public final DatePath<java.time.LocalDate> joinDate = createDate("joinDate", java.time.LocalDate.class);

    public final com.like.hrm.staff.domain.staff.license.QStaffLicenseList licenseList;

    public final QStaffName name;

    public final com.like.hrm.staff.domain.staff.period.QStaffPeriodList periodList;

    public final QResidentRegistrationNumber residentRegistrationNumber;

    public final DatePath<java.time.LocalDate> retireDate = createDate("retireDate", java.time.LocalDate.class);

    public final com.like.hrm.staff.domain.staff.schoolcareer.QStaffSchoolCareerList schoolCareerList;

    public final com.like.hrm.staff.domain.staff.dutyresponsibility.QStaffDutyList staffDutyResponsibilityList;

    public final StringPath workStateCode = createString("workStateCode");

    public QStaff(String variable) {
        this(Staff.class, forVariable(variable), INITS);
    }

    public QStaff(Path<? extends Staff> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaff(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaff(PathMetadata metadata, PathInits inits) {
        this(Staff.class, metadata, inits);
    }

    public QStaff(Class<? extends Staff> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.appointmentRecordList = inits.isInitialized("appointmentRecordList") ? new com.like.hrm.staff.domain.staff.appointment.QAppointmentRecordList(forProperty("appointmentRecordList")) : null;
        this.contactInfoList = inits.isInitialized("contactInfoList") ? new com.like.hrm.staff.domain.staff.contact.QContactInfoList(forProperty("contactInfoList")) : null;
        this.currentAppointment = inits.isInitialized("currentAppointment") ? new QCurrentAppointmentInformation(forProperty("currentAppointment")) : null;
        this.familyList = inits.isInitialized("familyList") ? new com.like.hrm.staff.domain.staff.family.QStaffFamilyList(forProperty("familyList")) : null;
        this.id = inits.isInitialized("id") ? new QStaffId(forProperty("id")) : null;
        this.licenseList = inits.isInitialized("licenseList") ? new com.like.hrm.staff.domain.staff.license.QStaffLicenseList(forProperty("licenseList")) : null;
        this.name = inits.isInitialized("name") ? new QStaffName(forProperty("name")) : null;
        this.periodList = inits.isInitialized("periodList") ? new com.like.hrm.staff.domain.staff.period.QStaffPeriodList(forProperty("periodList")) : null;
        this.residentRegistrationNumber = inits.isInitialized("residentRegistrationNumber") ? new QResidentRegistrationNumber(forProperty("residentRegistrationNumber")) : null;
        this.schoolCareerList = inits.isInitialized("schoolCareerList") ? new com.like.hrm.staff.domain.staff.schoolcareer.QStaffSchoolCareerList(forProperty("schoolCareerList")) : null;
        this.staffDutyResponsibilityList = inits.isInitialized("staffDutyResponsibilityList") ? new com.like.hrm.staff.domain.staff.dutyresponsibility.QStaffDutyList(forProperty("staffDutyResponsibilityList")) : null;
    }

}

