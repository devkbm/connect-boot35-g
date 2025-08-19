package com.like.system.webresource.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QWebResource is a Querydsl query type for WebResource
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWebResource extends EntityPathBase<WebResource> {

    private static final long serialVersionUID = -916873127L;

    public static final QWebResource webResource = new QWebResource("webResource");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public final StringPath url = createString("url");

    public QWebResource(String variable) {
        super(WebResource.class, forVariable(variable));
    }

    public QWebResource(Path<? extends WebResource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWebResource(PathMetadata metadata) {
        super(WebResource.class, metadata);
    }

}

