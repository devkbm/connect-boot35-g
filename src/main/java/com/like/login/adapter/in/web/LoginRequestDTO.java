package com.like.login.adapter.in.web;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.Builder;

@Builder
public record LoginRequestDTO(
		@Size(min=3, max=3, message="조직을 선택해주세요.")
		String companyCode,
		
		@NotBlank(message="직원번호를 입력해주세요")
		@Size(min=1, max=20, message="1자 이상 20자 이하의 아이디만 사용 가능합니다")
		@Pattern(regexp="^[A-Za-z0-9+]*$",message="영문,숫자로 이루어진 아이디만 사용 가능합니다")
		String staffNo,
		
		@NotBlank(message="비밀번호를 입력해주세요")
	    @Size(min=1,max=100,message="비밀번호는 1자 이상 100자 이하이어야 합니다")
	    //@Pattern(regexp="^(?=.*[a-zA-Z])(?=.*\\\\d)(?=.*\\\\W)(?=.*[!@#$%^&+=]).*",message="영문,숫자,특수문자로 이루어진 비밀번호만 사용 가능합니다")
		String password
		) {
	
	public String getUsername() {
		return this.companyCode + this.staffNo;
	}
}
