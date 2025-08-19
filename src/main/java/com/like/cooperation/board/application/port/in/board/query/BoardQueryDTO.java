package com.like.cooperation.board.application.port.in.board.query;

import static org.springframework.util.StringUtils.hasText;

import com.like.cooperation.board.domain.board.BoardType;
import com.like.cooperation.board.domain.board.QBoard;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;

public record BoardQueryDTO(
		String boardName,
		String boardType
		) {
	private static final QBoard qBoard = QBoard.board;
	
	public BooleanBuilder getBooleanBuilder() {
		BooleanBuilder builder = new BooleanBuilder();
		
		builder
			.and(likeBoardName(this.boardName))
			.and(equalBoardType(this.boardType));
					
		
		return builder;
	}
	
	private BooleanExpression likeBoardName(String boardName) {
		return hasText(boardName) ? qBoard.boardName.like("%"+boardName+"%") : null;					
	}
	
	private BooleanExpression equalBoardType(String boardType) {
		return hasText(boardType) ? qBoard.boardType.eq(BoardType.valueOf(boardType)) : null;			
	}
}
