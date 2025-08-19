package com.like.system.term.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QWordDictionary is a Querydsl query type for WordDictionary
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWordDictionary extends EntityPathBase<WordDictionary> {

    private static final long serialVersionUID = -378449571L;

    public static final QWordDictionary wordDictionary = new QWordDictionary("wordDictionary");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath logicalName = createString("logicalName");

    public final StringPath logicalNameEng = createString("logicalNameEng");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath physicalName = createString("physicalName");

    public QWordDictionary(String variable) {
        super(WordDictionary.class, forVariable(variable));
    }

    public QWordDictionary(Path<? extends WordDictionary> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWordDictionary(PathMetadata metadata) {
        super(WordDictionary.class, metadata);
    }

}

