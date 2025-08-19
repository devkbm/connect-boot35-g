package com.like.system.term.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTermDictionary is a Querydsl query type for TermDictionary
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTermDictionary extends EntityPathBase<TermDictionary> {

    private static final long serialVersionUID = 784596031L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTermDictionary termDictionary = new QTermDictionary("termDictionary");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath columnName = createString("columnName");

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QDataDomainDictionary dataDomain;

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final BooleanPath isCombiningWords = createBoolean("isCombiningWords");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath system = createString("system");

    public final StringPath term = createString("term");

    public final StringPath termEng = createString("termEng");

    public QTermDictionary(String variable) {
        this(TermDictionary.class, forVariable(variable), INITS);
    }

    public QTermDictionary(Path<? extends TermDictionary> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTermDictionary(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTermDictionary(PathMetadata metadata, PathInits inits) {
        this(TermDictionary.class, metadata, inits);
    }

    public QTermDictionary(Class<? extends TermDictionary> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dataDomain = inits.isInitialized("dataDomain") ? new QDataDomainDictionary(forProperty("dataDomain")) : null;
    }

}

