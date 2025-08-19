package com.like.hrm.hrmcode.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QHrmCodeType is a Querydsl query type for HrmCodeType
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHrmCodeType extends EntityPathBase<HrmCodeType> {

    private static final long serialVersionUID = 1711297363L;

    public static final QHrmCodeType hrmCodeType = new QHrmCodeType("hrmCodeType");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath fieldConfig = createString("fieldConfig");

    public final StringPath id = createString("id");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public QHrmCodeType(String variable) {
        super(HrmCodeType.class, forVariable(variable));
    }

    public QHrmCodeType(Path<? extends HrmCodeType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHrmCodeType(PathMetadata metadata) {
        super(HrmCodeType.class, metadata);
    }

}

