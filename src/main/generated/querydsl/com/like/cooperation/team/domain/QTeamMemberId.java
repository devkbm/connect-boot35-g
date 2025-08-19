package com.like.cooperation.team.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QTeamMemberId is a Querydsl query type for TeamMemberId
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QTeamMemberId extends BeanPath<TeamMemberId> {

    private static final long serialVersionUID = -241532248L;

    public static final QTeamMemberId teamMemberId = new QTeamMemberId("teamMemberId");

    public final NumberPath<Long> team = createNumber("team", Long.class);

    public final StringPath userId = createString("userId");

    public QTeamMemberId(String variable) {
        super(TeamMemberId.class, forVariable(variable));
    }

    public QTeamMemberId(Path<? extends TeamMemberId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeamMemberId(PathMetadata metadata) {
        super(TeamMemberId.class, metadata);
    }

}

