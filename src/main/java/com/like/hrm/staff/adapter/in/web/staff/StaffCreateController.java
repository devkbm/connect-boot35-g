package com.like.hrm.staff.adapter.in.web.staff;

import jakarta.validation.Valid;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.hrm.staff.application.port.in.staff.StaffCreateDTO;
import com.like.hrm.staff.application.port.in.staff.StaffCreateUseCase;

@RestController
public class StaffCreateController {
	
	private StaffCreateUseCase useCase;
		
	public StaffCreateController(StaffCreateUseCase useCase) {
		this.useCase = useCase;
	}		
	
		
	@PostMapping("/api/hrm/staff/create")
	public ResponseEntity<?> newStaff(@RequestBody @Valid StaffCreateDTO dto) {											
								
		useCase.create(dto);
											 				
		return toList(null, "직원번호 : %s , 생성되었습니다.".formatted(dto.staffNo()));
	}		
			
}
