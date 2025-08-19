package com.like.cooperation.board.domain.post;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.Getter;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.like.core.jpa.domain.AbstractAuditEntity;

/**
 * <p>게시글 조회여부 클래스</p>
 * 
 * [상세내용] <br>
 *   1. <br>
 * [제약조건] <br>
 *   1. <br>
 */
@JsonAutoDetect
@Getter
@Entity
@Table(name = "GRWPOSTCHECK")
@EntityListeners(AuditingEntityListener.class)
public class PostUserHitCount extends AbstractAuditEntity implements Serializable {
	
	private static final long serialVersionUID = 6322358555393677284L;
	
	@EmbeddedId
	PostUserHitCountId id;	
		
	@Comment("조회수")
	@Column(name="hit_cnt")
	Integer hitCount;
        
	/**
	 * 게시판 외래키
	 */
	/*
    @JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "article_id", nullable=false, updatable=false)
	Article article;
	*/
	
    protected PostUserHitCount() {}
    
	public PostUserHitCount(Post article, String userId) {		
		this.id = new PostUserHitCountId(article, userId);
		this.hitCount = 0;
	}
			
	public void updateHitCnt() {
		this.hitCount = this.hitCount + 1;
	}
		
			
}
