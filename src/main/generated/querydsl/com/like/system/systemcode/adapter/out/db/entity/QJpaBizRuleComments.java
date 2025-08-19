package com.like.system.systemcode.adapter.out.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QJpaBizRuleComments is a Querydsl query type for JpaBizRuleComments
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QJpaBizRuleComments extends BeanPath<JpaBizRuleComments> {

    private static final long serialVersionUID = -1010159745L;

    public static final QJpaBizRuleComments jpaBizRuleComments = new QJpaBizRuleComments("jpaBizRuleComments");

    public final StringPath bizRuleComment1 = createString("bizRuleComment1");

    public final StringPath bizRuleComment10 = createString("bizRuleComment10");

    public final StringPath bizRuleComment2 = createString("bizRuleComment2");

    public final StringPath bizRuleComment3 = createString("bizRuleComment3");

    public final StringPath bizRuleComment4 = createString("bizRuleComment4");

    public final StringPath bizRuleComment5 = createString("bizRuleComment5");

    public final StringPath bizRuleComment6 = createString("bizRuleComment6");

    public final StringPath bizRuleComment7 = createString("bizRuleComment7");

    public final StringPath bizRuleComment8 = createString("bizRuleComment8");

    public final StringPath bizRuleComment9 = createString("bizRuleComment9");

    public QJpaBizRuleComments(String variable) {
        super(JpaBizRuleComments.class, forVariable(variable));
    }

    public QJpaBizRuleComments(Path<? extends JpaBizRuleComments> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaBizRuleComments(PathMetadata metadata) {
        super(JpaBizRuleComments.class, metadata);
    }

}

