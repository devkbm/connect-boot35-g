package com.like.cooperation.survey.surveyform.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSurveyForm is a Querydsl query type for SurveyForm
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSurveyForm extends EntityPathBase<SurveyForm> {

    private static final long serialVersionUID = -868267505L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSurveyForm surveyForm = new QSurveyForm("surveyForm");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> formId = createNumber("formId", Long.class);

    public final BooleanPath isFinish = createBoolean("isFinish");

    public final ListPath<SurveyItem, QSurveyItem> items = this.<SurveyItem, QSurveyItem>createList("items", SurveyItem.class, QSurveyItem.class, PathInits.DIRECT2);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final com.like.common.vo.QLocalDatePeriod period;

    public final StringPath title = createString("title");

    public QSurveyForm(String variable) {
        this(SurveyForm.class, forVariable(variable), INITS);
    }

    public QSurveyForm(Path<? extends SurveyForm> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSurveyForm(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSurveyForm(PathMetadata metadata, PathInits inits) {
        this(SurveyForm.class, metadata, inits);
    }

    public QSurveyForm(Class<? extends SurveyForm> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.period = inits.isInitialized("period") ? new com.like.common.vo.QLocalDatePeriod(forProperty("period")) : null;
    }

}

