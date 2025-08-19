package com.like.hrm.hrmcode.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHrmCode is a Querydsl query type for HrmCode
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHrmCode extends EntityPathBase<HrmCode> {

    private static final long serialVersionUID = 518599801L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHrmCode hrmCode = new QHrmCode("hrmCode");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath codeName = createString("codeName");

    public final StringPath comment = createString("comment");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath extraInfo = createString("extraInfo");

    public final QHrmCodeId id;

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final BooleanPath useYn = createBoolean("useYn");

    public QHrmCode(String variable) {
        this(HrmCode.class, forVariable(variable), INITS);
    }

    public QHrmCode(Path<? extends HrmCode> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHrmCode(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHrmCode(PathMetadata metadata, PathInits inits) {
        this(HrmCode.class, metadata, inits);
    }

    public QHrmCode(Class<? extends HrmCode> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QHrmCodeId(forProperty("id")) : null;
    }

}

