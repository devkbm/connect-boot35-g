package com.like.common.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Embeddable
public class PhoneNumber {

	@Column(name="PHONE_NO")
	private String number;
	
	public PhoneNumber(String number) {
		this.number = number;
	}
	
	public String getPhoneNumber() {
		return this.number;
	}
}
