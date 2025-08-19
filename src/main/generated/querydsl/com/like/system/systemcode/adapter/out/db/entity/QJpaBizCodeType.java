package com.like.system.systemcode.adapter.out.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJpaBizCodeType is a Querydsl query type for JpaBizCodeType
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QJpaBizCodeType extends EntityPathBase<JpaBizCodeType> {

    private static final long serialVersionUID = -1676700490L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJpaBizCodeType jpaBizCodeType = new QJpaBizCodeType("jpaBizCodeType");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final EnumPath<JpaBizTypeEnum> bizType = createEnum("bizType", JpaBizTypeEnum.class);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QJpaBizCodeTypeId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath name = createString("name");

    public final QJpaBizRuleComments ruleComments;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public QJpaBizCodeType(String variable) {
        this(JpaBizCodeType.class, forVariable(variable), INITS);
    }

    public QJpaBizCodeType(Path<? extends JpaBizCodeType> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJpaBizCodeType(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJpaBizCodeType(PathMetadata metadata, PathInits inits) {
        this(JpaBizCodeType.class, metadata, inits);
    }

    public QJpaBizCodeType(Class<? extends JpaBizCodeType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QJpaBizCodeTypeId(forProperty("id")) : null;
        this.ruleComments = inits.isInitialized("ruleComments") ? new QJpaBizRuleComments(forProperty("ruleComments")) : null;
    }

}

