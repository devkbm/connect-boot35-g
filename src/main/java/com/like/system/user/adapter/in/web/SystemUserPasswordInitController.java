package com.like.system.user.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.system.user.application.port.in.password.SystemUserPasswordInitUseCase;

@RestController
public class SystemUserPasswordInitController {		
				
	private SystemUserPasswordInitUseCase useCase;
		
	public SystemUserPasswordInitController(SystemUserPasswordInitUseCase useCase) {
		this.useCase = useCase;
	}
			
	@PostMapping("/api/system/user/{userId}/initpassword")
	public ResponseEntity<?> initializePassword(@RequestParam String companyCode, @PathVariable String userId) {			
				
		useCase.initPassword(companyCode, userId);
								 					
		return toList(null, "비밀번호가 초기화되었습니다.");
	}	
			
}
