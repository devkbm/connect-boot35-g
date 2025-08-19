package com.like.hrm.staffsalary.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSalaryTable is a Querydsl query type for SalaryTable
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSalaryTable extends EntityPathBase<SalaryTable> {

    private static final long serialVersionUID = 5589006L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSalaryTable salaryTable = new QSalaryTable("salaryTable");

    public final NumberPath<java.math.BigDecimal> amount = createNumber("amount", java.math.BigDecimal.class);

    public final QSalaryAppointmentInformation appointmentInfo;

    public final DatePath<java.time.LocalDate> baseDate = createDate("baseDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QSalaryTable(String variable) {
        this(SalaryTable.class, forVariable(variable), INITS);
    }

    public QSalaryTable(Path<? extends SalaryTable> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSalaryTable(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSalaryTable(PathMetadata metadata, PathInits inits) {
        this(SalaryTable.class, metadata, inits);
    }

    public QSalaryTable(Class<? extends SalaryTable> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.appointmentInfo = inits.isInitialized("appointmentInfo") ? new QSalaryAppointmentInformation(forProperty("appointmentInfo")) : null;
    }

}

