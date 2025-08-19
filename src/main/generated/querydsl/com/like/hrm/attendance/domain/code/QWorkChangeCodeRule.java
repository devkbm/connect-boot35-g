package com.like.hrm.attendance.domain.code;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkChangeCodeRule is a Querydsl query type for WorkChangeCodeRule
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkChangeCodeRule extends EntityPathBase<WorkChangeCodeRule> {

    private static final long serialVersionUID = 1950327281L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkChangeCodeRule workChangeCodeRule = new QWorkChangeCodeRule("workChangeCodeRule");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> dutyApplicationInputLimitId = createNumber("dutyApplicationInputLimitId", Long.class);

    public final QWorkChangeCode dutyCode;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public QWorkChangeCodeRule(String variable) {
        this(WorkChangeCodeRule.class, forVariable(variable), INITS);
    }

    public QWorkChangeCodeRule(Path<? extends WorkChangeCodeRule> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkChangeCodeRule(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkChangeCodeRule(PathMetadata metadata, PathInits inits) {
        this(WorkChangeCodeRule.class, metadata, inits);
    }

    public QWorkChangeCodeRule(Class<? extends WorkChangeCodeRule> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dutyCode = inits.isInitialized("dutyCode") ? new QWorkChangeCode(forProperty("dutyCode")) : null;
    }

}

