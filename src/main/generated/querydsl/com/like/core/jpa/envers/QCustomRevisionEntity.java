package com.like.core.jpa.envers;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomRevisionEntity is a Querydsl query type for CustomRevisionEntity
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCustomRevisionEntity extends EntityPathBase<CustomRevisionEntity> {

    private static final long serialVersionUID = -315617044L;

    public static final QCustomRevisionEntity customRevisionEntity = new QCustomRevisionEntity("customRevisionEntity");

    public final NumberPath<Long> revisionId = createNumber("revisionId", Long.class);

    public final NumberPath<Long> revisionTimeStamp = createNumber("revisionTimeStamp", Long.class);

    public final StringPath revisionUserId = createString("revisionUserId");

    public QCustomRevisionEntity(String variable) {
        super(CustomRevisionEntity.class, forVariable(variable));
    }

    public QCustomRevisionEntity(Path<? extends CustomRevisionEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomRevisionEntity(PathMetadata metadata) {
        super(CustomRevisionEntity.class, metadata);
    }

}

