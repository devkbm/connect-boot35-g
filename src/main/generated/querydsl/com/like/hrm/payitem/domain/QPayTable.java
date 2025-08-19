package com.like.hrm.payitem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPayTable is a Querydsl query type for PayTable
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayTable extends EntityPathBase<PayTable> {

    private static final long serialVersionUID = 1161219720L;

    public static final QPayTable payTable = new QPayTable("payTable");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    public final StringPath companyCode = createString("companyCode");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath id = createString("id");

    public final BooleanPath isEnable = createBoolean("isEnable");

    public final StringPath jobGradeCode = createString("jobGradeCode");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath occupationCode = createString("occupationCode");

    public final StringPath payItemCode = createString("payItemCode");

    public final StringPath payStepCode = createString("payStepCode");

    public final NumberPath<java.math.BigDecimal> wageAmount = createNumber("wageAmount", java.math.BigDecimal.class);

    public QPayTable(String variable) {
        super(PayTable.class, forVariable(variable));
    }

    public QPayTable(Path<? extends PayTable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPayTable(PathMetadata metadata) {
        super(PayTable.class, metadata);
    }

}

