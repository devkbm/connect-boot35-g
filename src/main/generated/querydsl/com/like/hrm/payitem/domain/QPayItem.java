package com.like.hrm.payitem.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPayItem is a Querydsl query type for PayItem
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPayItem extends EntityPathBase<PayItem> {

    private static final long serialVersionUID = -378492647L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPayItem payItem = new QPayItem("payItem");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final QPayItemId id;

    public final StringPath itemName = createString("itemName");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final NumberPath<Integer> seq = createNumber("seq", Integer.class);

    public final StringPath type = createString("type");

    public final BooleanPath usePayTable = createBoolean("usePayTable");

    public QPayItem(String variable) {
        this(PayItem.class, forVariable(variable), INITS);
    }

    public QPayItem(Path<? extends PayItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPayItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPayItem(PathMetadata metadata, PathInits inits) {
        this(PayItem.class, metadata, inits);
    }

    public QPayItem(Class<? extends PayItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QPayItemId(forProperty("id")) : null;
    }

}

