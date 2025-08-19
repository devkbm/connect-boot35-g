package com.like.system.user.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Embeddable
public class SystemUserAccountAttribute implements Serializable {
		
	private static final long serialVersionUID = 5321100631628293509L;

	/**
	 * 계정의 만료여부 : true (만료 안됨)
	 */
	@Column(name="NON_EXPIRED_YN")
	Boolean isAccountNonExpired = true;
		
	/**
	 * 계정의 잠김 여부 : true (잠기지 않음)
	 */
	@Column(name="NON_LOCKED_YN")
	Boolean isAccountNonLocked = true;
		
	/**
	 * 비밀번호 만료 여부 : true (만료 안됨)
	 */
	@Column(name="PASS_NON_EXPIRED_YN")
	Boolean isCredentialsNonExpired = true;
		
	/**
	 * 계정의 활성화 여부 : true (활성화)
	 */
	@Column(name="ENABLED_YN")
	Boolean isEnabled = true;
	
	public SystemUserAccountAttribute(
			 Boolean isAccountNonExpired
			,Boolean isAccountNonLocked
			,Boolean isCredentialsNonExpired
			,Boolean isEnabled) {
		
		this.isAccountNonExpired = isAccountNonExpired;
		this.isAccountNonLocked = isAccountNonLocked;
		this.isCredentialsNonExpired = isCredentialsNonExpired;
		this.isEnabled = isEnabled;			
	}
}
