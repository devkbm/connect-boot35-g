package com.like.hrm.staffsalary.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStaffSalaryItem is a Querydsl query type for StaffSalaryItem
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStaffSalaryItem extends EntityPathBase<StaffSalaryItem> {

    private static final long serialVersionUID = 111050215L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStaffSalaryItem staffSalaryItem = new QStaffSalaryItem("staffSalaryItem");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final NumberPath<Integer> calcDays = createNumber("calcDays", Integer.class);

    public final StringPath calcFomula = createString("calcFomula");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath salaryItemCode = createString("salaryItemCode");

    public final QStaffSalary staffSalary;

    public QStaffSalaryItem(String variable) {
        this(StaffSalaryItem.class, forVariable(variable), INITS);
    }

    public QStaffSalaryItem(Path<? extends StaffSalaryItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStaffSalaryItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStaffSalaryItem(PathMetadata metadata, PathInits inits) {
        this(StaffSalaryItem.class, metadata, inits);
    }

    public QStaffSalaryItem(Class<? extends StaffSalaryItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.staffSalary = inits.isInitialized("staffSalary") ? new QStaffSalary(forProperty("staffSalary"), inits.get("staffSalary")) : null;
    }

}

