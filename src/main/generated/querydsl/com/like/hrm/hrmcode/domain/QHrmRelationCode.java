package com.like.hrm.hrmcode.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QHrmRelationCode is a Querydsl query type for HrmRelationCode
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHrmRelationCode extends EntityPathBase<HrmRelationCode> {

    private static final long serialVersionUID = -1668286315L;

    public static final QHrmRelationCode hrmRelationCode = new QHrmRelationCode("hrmRelationCode");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath childDetailId = createString("childDetailId");

    public final StringPath childTypeId = createString("childTypeId");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath parentDetailId = createString("parentDetailId");

    public final StringPath parentTypeId = createString("parentTypeId");

    public final NumberPath<Long> relationId = createNumber("relationId", Long.class);

    public final StringPath relCode = createString("relCode");

    public QHrmRelationCode(String variable) {
        super(HrmRelationCode.class, forVariable(variable));
    }

    public QHrmRelationCode(Path<? extends HrmRelationCode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHrmRelationCode(PathMetadata metadata) {
        super(HrmRelationCode.class, metadata);
    }

}

