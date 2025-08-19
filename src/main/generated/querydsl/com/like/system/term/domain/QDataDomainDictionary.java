package com.like.system.term.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QDataDomainDictionary is a Querydsl query type for DataDomainDictionary
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDataDomainDictionary extends EntityPathBase<DataDomainDictionary> {

    private static final long serialVersionUID = 1442370721L;

    public static final QDataDomainDictionary dataDomainDictionary = new QDataDomainDictionary("dataDomainDictionary");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final EnumPath<Database> database = createEnum("database", Database.class);

    public final StringPath dataType = createString("dataType");

    public final StringPath domainName = createString("domainName");

    public final StringPath id = createString("id");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public QDataDomainDictionary(String variable) {
        super(DataDomainDictionary.class, forVariable(variable));
    }

    public QDataDomainDictionary(Path<? extends DataDomainDictionary> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDataDomainDictionary(PathMetadata metadata) {
        super(DataDomainDictionary.class, metadata);
    }

}

