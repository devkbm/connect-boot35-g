package com.like.hrm.attendance.domain.code;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkChangeCode is a Querydsl query type for WorkChangeCode
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWorkChangeCode extends EntityPathBase<WorkChangeCode> {

    private static final long serialVersionUID = 1580681557L;

    public static final QWorkChangeCode workChangeCode = new QWorkChangeCode("workChangeCode");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath dutyCode = createString("dutyCode");

    public final ListPath<WorkChangeCodeRule, QWorkChangeCodeRule> dutyCodeRule = this.<WorkChangeCodeRule, QWorkChangeCodeRule>createList("dutyCodeRule", WorkChangeCodeRule.class, QWorkChangeCodeRule.class, PathInits.DIRECT2);

    public final StringPath dutyGroup = createString("dutyGroup");

    public final StringPath dutyName = createString("dutyName");

    public final BooleanPath enabled = createBoolean("enabled");

    public final NumberPath<Long> familyEventAmt = createNumber("familyEventAmt", Long.class);

    public final BooleanPath isFamilyEvent = createBoolean("isFamilyEvent");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public QWorkChangeCode(String variable) {
        super(WorkChangeCode.class, forVariable(variable));
    }

    public QWorkChangeCode(Path<? extends WorkChangeCode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkChangeCode(PathMetadata metadata) {
        super(WorkChangeCode.class, metadata);
    }

}

