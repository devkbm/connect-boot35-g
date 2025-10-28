package com.like.cooperation.board.adapter.out.db.querydsl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.cooperation.board.application.port.in.board.query.BoardQueryDTO;
import com.like.cooperation.board.application.port.in.board.query.BoardQueryResultDTO;
import com.like.cooperation.board.domain.board.QBoard;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class BoardListQuerydsl {

	private JPAQueryFactory queryFactory;
	private final QBoard qBoard = QBoard.board;
	
	BoardListQuerydsl(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}
	
	public List<BoardQueryResultDTO> selectList(BoardQueryDTO dto) {
 		
		return queryFactory				
				.select(Projections.fields(BoardQueryResultDTO.class,
						qBoard.modifiedAppUrl.as("clientAppUrl"),
						qBoard.boardId,
						qBoard.parent.boardId.as("boardParentId"),
						qBoard.boardType.as("boardType"),
						qBoard.boardName,
						qBoard.description.as("boardDescription"),
						qBoard.useYn						
					)
				)
				.from(qBoard)
				.where(dto.getBooleanBuilder())
				.fetch();				
	}
}
