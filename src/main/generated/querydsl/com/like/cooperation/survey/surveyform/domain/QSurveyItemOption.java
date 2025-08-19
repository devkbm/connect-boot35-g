package com.like.cooperation.survey.surveyform.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QSurveyItemOption is a Querydsl query type for SurveyItemOption
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QSurveyItemOption extends BeanPath<SurveyItemOption> {

    private static final long serialVersionUID = 277868147L;

    public static final QSurveyItemOption surveyItemOption = new QSurveyItemOption("surveyItemOption");

    public final BooleanPath isSelected = createBoolean("isSelected");

    public final StringPath label = createString("label");

    public final StringPath value = createString("value");

    public QSurveyItemOption(String variable) {
        super(SurveyItemOption.class, forVariable(variable));
    }

    public QSurveyItemOption(Path<? extends SurveyItemOption> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSurveyItemOption(PathMetadata metadata) {
        super(SurveyItemOption.class, metadata);
    }

}

