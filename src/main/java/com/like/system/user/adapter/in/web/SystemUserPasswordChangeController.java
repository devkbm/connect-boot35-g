package com.like.system.user.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.system.user.application.port.in.password.SystemUserPasswordChangeDTO;
import com.like.system.user.application.port.in.password.SystemUserPasswordChangeUseCase;

@RestController
public class SystemUserPasswordChangeController {		
				
	private SystemUserPasswordChangeUseCase useCase;
		
	public SystemUserPasswordChangeController(SystemUserPasswordChangeUseCase useCase) {
		this.useCase = useCase;
	}
	
	@PostMapping("/api/system/user/{id}/changepassword")
	public ResponseEntity<?> changePassword(@RequestBody SystemUserPasswordChangeDTO dto) {				
						
		useCase.changePassword(dto);													
								 					
		return toList(null, "비밀번호가 변경되었습니다.");
	}			
			
}
