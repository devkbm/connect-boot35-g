package com.like.login.history;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QLogInOutHistory is a Querydsl query type for LogInOutHistory
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLogInOutHistory extends EntityPathBase<LogInOutHistory> {

    private static final long serialVersionUID = 1919315014L;

    public static final QLogInOutHistory logInOutHistory = new QLogInOutHistory("logInOutHistory");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    public final StringPath clientIp = createString("clientIp");

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final DateTimePath<java.time.LocalDateTime> eventDateTime = createDateTime("eventDateTime", java.time.LocalDateTime.class);

    public final EnumPath<LogInOutHistory.LOG_TYPE> eventType = createEnum("eventType", LogInOutHistory.LOG_TYPE.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isSuccess = createBoolean("isSuccess");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath userId = createString("userId");

    public QLogInOutHistory(String variable) {
        super(LogInOutHistory.class, forVariable(variable));
    }

    public QLogInOutHistory(Path<? extends LogInOutHistory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLogInOutHistory(PathMetadata metadata) {
        super(LogInOutHistory.class, metadata);
    }

}

