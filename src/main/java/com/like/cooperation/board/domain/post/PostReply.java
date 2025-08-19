package com.like.cooperation.board.domain.post;

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

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "GRWARTICLEREPLY")
@EntityListeners(AuditingEntityListener.class)
public class PostReply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ARTICLE_REPLY_ID")
	Long articleReplyId;
	
	@Column(name="USER_ID")
	String userId;
	
	@Comment("내용")
	@Column(name="CONTENTS", length = 4000)
    String contents;
	
	@Comment("댓글 부모ID")
	@Column(name="ARTICLE_REPLY_P_ID")
	Long articleReplyParentId;
	
	/**
	 * 게시글 외래키
	 */           
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ARTICLE_ID", nullable=false, updatable=false)
	Post article;
	
	public PostReply(Post article, String userId, String contents) {
		this.article = article;
		this.userId = userId;
		this.contents = contents;
	}
	
	public PostReply(PostReply reply, String userId, String contents) {
		this.article = reply.getArticle();
		this.articleReplyParentId = reply.getArticleReplyId();
		this.userId = userId;
		this.contents = contents;
	}
}
