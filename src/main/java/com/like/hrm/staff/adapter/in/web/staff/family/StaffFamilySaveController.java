package com.like.hrm.staff.adapter.in.web.staff.family;

import jakarta.validation.Valid;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.hrm.staff.application.port.in.staff.family.save.StaffFamilySaveDTO;
import com.like.hrm.staff.application.port.in.staff.family.save.StaffFamilySaveUseCase;


@RestController
public class StaffFamilySaveController {

	private StaffFamilySaveUseCase useCase;
		
	public StaffFamilySaveController(StaffFamilySaveUseCase useCase) {
		this.useCase = useCase;	
	}
		
	@PostMapping("/api/hrm/staff/{staffId}/family")
	public ResponseEntity<?> saveFamily(@Valid @RequestBody StaffFamilySaveDTO dto) {			
							
		useCase.save(dto);
											 				
		return toList(null, MessageUtil.getSaveMessage(1));
	}
	
}
