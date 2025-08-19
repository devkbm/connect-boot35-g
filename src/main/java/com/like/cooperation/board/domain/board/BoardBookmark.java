package com.like.cooperation.board.domain.board;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.like.core.jpa.domain.AbstractAuditEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>게시판 즐겨찾기 클래스</p>
 * 
 * [상세내용] <br>
 *   1. <br>
 * [제약조건] <br>
 *   1. <br>
 */
@Getter
@NoArgsConstructor
@Entity
@Table(name = "GRWBOARDBOOKMARK")
@EntityListeners(AuditingEntityListener.class)
public class BoardBookmark extends AbstractAuditEntity implements Serializable {
	
	private static final long serialVersionUID = -1585368113519480228L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PK_BOOKMARK")
	Long pkBookmark;
	
	@Comment("게시판 ID")
	@ManyToOne(fetch = FetchType.LAZY, cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="FK_BOARD")
	Board board;
	
	@Comment("사용자 ID")
	@Column(name="USER_ID")
	String userId;
				
	@Comment("순번")
	@Column(name="SEQ")
	Long seq;
		
	public BoardBookmark(Board board
						,String userId) {		
		if (board == null) throw new IllegalArgumentException("게시판이 존재하지 않습니다.");
		
		this.board 	= board;
		this.userId = userId;		
		this.seq 	= 0L;
	}
	
	public void changeSequence(long seq) {
		this.seq = seq;
	}
}
