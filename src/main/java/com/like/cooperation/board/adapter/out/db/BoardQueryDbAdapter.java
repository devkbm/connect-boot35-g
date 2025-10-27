package com.like.cooperation.board.adapter.out.db;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.cooperation.board.adapter.out.db.querydsl.BoardListQuerydsl;
import com.like.cooperation.board.adapter.out.db.querydsl.BoardTreeQuerydsl;
import com.like.cooperation.board.application.port.in.board.query.BoardHierarchy;
import com.like.cooperation.board.application.port.in.board.query.BoardQueryDTO;
import com.like.cooperation.board.application.port.in.board.query.BoardQueryResultDTO;
import com.like.cooperation.board.application.port.out.board.BoardQueryDbPort;


@Repository
public class BoardQueryDbAdapter implements BoardQueryDbPort {
	
	BoardListQuerydsl boardListQuerydsl;
	BoardTreeQuerydsl boardTreeQuerydsl;
	
	public BoardQueryDbAdapter(
			BoardListQuerydsl boardListQuerydsl,
			BoardTreeQuerydsl boardTreeQuerydsl
			) {
		this.boardListQuerydsl = boardListQuerydsl;
		this.boardTreeQuerydsl = boardTreeQuerydsl;
	}	
	
	@Override
	public List<BoardQueryResultDTO> selectList(BoardQueryDTO dto) {		 		
		return boardListQuerydsl.selectList(dto);				
	}

	@Override
	public List<BoardHierarchy> selectHierarchy() {			
		return this.boardTreeQuerydsl.selectHierarchy();
	}
	

}
