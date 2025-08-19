package com.like.core.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractAuditEntity is a Querydsl query type for AbstractAuditEntity
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QAbstractAuditEntity extends EntityPathBase<AbstractAuditEntity> {

    private static final long serialVersionUID = -1091059990L;

    public static final QAbstractAuditEntity abstractAuditEntity = new QAbstractAuditEntity("abstractAuditEntity");

    public final StringPath createdAppUrl = createString("createdAppUrl");

    public final SimplePath<AuditorDetails> createdBy = createSimple("createdBy", AuditorDetails.class);

    public final DateTimePath<java.time.LocalDateTime> createdDt = createDateTime("createdDt", java.time.LocalDateTime.class);

    public final StringPath modifiedAppUrl = createString("modifiedAppUrl");

    public final SimplePath<AuditorDetails> modifiedBy = createSimple("modifiedBy", AuditorDetails.class);

    public final DateTimePath<java.time.LocalDateTime> modifiedDt = createDateTime("modifiedDt", java.time.LocalDateTime.class);

    public QAbstractAuditEntity(String variable) {
        super(AbstractAuditEntity.class, forVariable(variable));
    }

    public QAbstractAuditEntity(Path<? extends AbstractAuditEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractAuditEntity(PathMetadata metadata) {
        super(AbstractAuditEntity.class, metadata);
    }

}

