package com.like.cooperation.board.application.port.in.board.query;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.annotations.Generated;

/**
 * com.like.cooperation.board.application.port.in.board.query.QBoardHierarchy is a Querydsl Projection type for BoardHierarchy
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBoardHierarchy extends ConstructorExpression<BoardHierarchy> {

    private static final long serialVersionUID = 926622588L;

    public QBoardHierarchy(com.querydsl.core.types.Expression<Long> key, com.querydsl.core.types.Expression<Long> boardParentId, com.querydsl.core.types.Expression<com.like.cooperation.board.domain.board.BoardType> boardType, com.querydsl.core.types.Expression<String> title, com.querydsl.core.types.Expression<String> boardDescription) {
        super(BoardHierarchy.class, new Class<?>[]{long.class, long.class, com.like.cooperation.board.domain.board.BoardType.class, String.class, String.class}, key, boardParentId, boardType, title, boardDescription);
    }

}

