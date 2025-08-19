package com.like.cooperation.survey.surveyform.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSurveyItem is a Querydsl query type for SurveyItem
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSurveyItem extends EntityPathBase<SurveyItem> {

    private static final long serialVersionUID = -868173730L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSurveyItem surveyItem = new QSurveyItem("surveyItem");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> itemId = createNumber("itemId", Long.class);

    public final StringPath itemTitle = createString("itemTitle");

    public final EnumPath<SurveyItemType> itemType = createEnum("itemType", SurveyItemType.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final ListPath<SurveyItemOption, QSurveyItemOption> optionList = this.<SurveyItemOption, QSurveyItemOption>createList("optionList", SurveyItemOption.class, QSurveyItemOption.class, PathInits.DIRECT2);

    public final BooleanPath required = createBoolean("required");

    public final QSurveyForm surveyForm;

    public QSurveyItem(String variable) {
        this(SurveyItem.class, forVariable(variable), INITS);
    }

    public QSurveyItem(Path<? extends SurveyItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSurveyItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSurveyItem(PathMetadata metadata, PathInits inits) {
        this(SurveyItem.class, metadata, inits);
    }

    public QSurveyItem(Class<? extends SurveyItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.surveyForm = inits.isInitialized("surveyForm") ? new QSurveyForm(forProperty("surveyForm"), inits.get("surveyForm")) : null;
    }

}

