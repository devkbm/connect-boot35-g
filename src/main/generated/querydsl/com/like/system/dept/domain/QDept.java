package com.like.system.dept.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;
import com.like.system.dept.adapter.out.db.data.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDept is a Querydsl query type for Dept
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDept extends EntityPathBase<Dept> {

    private static final long serialVersionUID = 2009353467L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDept dept = new QDept("dept");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath deptAbbreviationEnglish = createString("deptAbbreviationEnglish");

    public final StringPath deptAbbreviationKorean = createString("deptAbbreviationKorean");

    public final StringPath deptNameEnglish = createString("deptNameEnglish");

    public final StringPath deptNameKorean = createString("deptNameKorean");

    public final QDeptId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final QDept parentDept;

    public final StringPath parentDeptCode = createString("parentDeptCode");

    public final com.like.common.vo.QLocalDatePeriod period;

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public QDept(String variable) {
        this(Dept.class, forVariable(variable), INITS);
    }

    public QDept(Path<? extends Dept> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDept(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDept(PathMetadata metadata, PathInits inits) {
        this(Dept.class, metadata, inits);
    }

    public QDept(Class<? extends Dept> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QDeptId(forProperty("id")) : null;
        this.parentDept = inits.isInitialized("parentDept") ? new QDept(forProperty("parentDept"), inits.get("parentDept")) : null;
        this.period = inits.isInitialized("period") ? new com.like.common.vo.QLocalDatePeriod(forProperty("period")) : null;
    }

    public BooleanExpression isChildNode() {
        return DeptQueryExpression.isChildNode(this);
    }

    public BooleanExpression isRootNode() {
        return DeptQueryExpression.isRootNode(this);
    }

}

