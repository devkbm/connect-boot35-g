package com.like.hrm.anualleave.domain.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnualLeave is a Querydsl query type for AnualLeave
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAnualLeave extends EntityPathBase<AnualLeave> {

    private static final long serialVersionUID = 852579166L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnualLeave anualLeave = new QAnualLeave("anualLeave");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final NumberPath<Double> add_cnt = createNumber("add_cnt", Double.class);

    public final DatePath<java.time.LocalDate> base = createDate("base", java.time.LocalDate.class);

    public final NumberPath<Double> cnt = createNumber("cnt", Double.class);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> except_days = createNumber("except_days", Long.class);

    public final DatePath<java.time.LocalDate> from = createDate("from", java.time.LocalDate.class);

    public final QAnualLeaveId id;

    public final BooleanPath isIntraAnual = createBoolean("isIntraAnual");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final DatePath<java.time.LocalDate> to = createDate("to", java.time.LocalDate.class);

    public final NumberPath<Long> total_work_days = createNumber("total_work_days", Long.class);

    public final NumberPath<Double> use_cnt = createNumber("use_cnt", Double.class);

    public QAnualLeave(String variable) {
        this(AnualLeave.class, forVariable(variable), INITS);
    }

    public QAnualLeave(Path<? extends AnualLeave> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAnualLeave(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAnualLeave(PathMetadata metadata, PathInits inits) {
        this(AnualLeave.class, metadata, inits);
    }

    public QAnualLeave(Class<? extends AnualLeave> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QAnualLeaveId(forProperty("id")) : null;
    }

}

