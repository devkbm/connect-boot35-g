package com.like.cooperation.board.domain.post;

import java.util.List;

import com.querydsl.core.types.Predicate;

public interface PostQueryRepository {

	/**
	 * 게시글 엔티티 리스트 조회
	 * @param fkBoard	게시글 엔티티 FK
	 * @return 게시글 도메인 리스트
	 */
	List<Post> getArticleList(Long fkBoard);
		
	/**
	 * 게시글 엔티티 리스트 조회
	 * @param fkBoard		게시글 엔티티 FK
	 * @param likeTitle		제목
	 * @param likeContents	내용
	 * @return	게시글 엔티티 리스트
	 */
	List<Post> getArticleList(Predicate condition);
			
}
