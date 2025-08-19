package com.like.login.history;

import java.time.LocalDateTime;

import com.like.core.jpa.domain.AbstractAuditEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 로그인, 로그아웃 이력관리 클래스
 */
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "COMLOGINHISTORY")
public class LogInOutHistory extends AbstractAuditEntity {

	public enum LOG_TYPE { 
		LOGIN, LOGOUT
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	// AbstractAggregateRoot d;
	// https://jhhj424.tistory.com/68	
	// https://namjug-kim.github.io/2020/03/24/spring-ddd-domain-event.html
	
	
	@Column(name="userId")
	String userId;
	
	@Column(name="event_type")
	LOG_TYPE eventType;
	
	@Column(name="event_dt")
	LocalDateTime eventDateTime;	
	
	@Column(name="client_ip")
	String clientIp;		
	
	@Column(name="success_yn")
	Boolean isSuccess;	

	/**
	 * @param userId
	 * @param eventType
	 * @param clientIp
	 * @param isSuccess
	 */
	public LogInOutHistory(String userId, LOG_TYPE eventType, String clientIp, Boolean isSuccess) {
		this.userId = userId;
		this.eventType = eventType;
		this.eventDateTime = LocalDateTime.now();
		this.clientIp = clientIp;
		this.isSuccess = isSuccess;
	}
}
