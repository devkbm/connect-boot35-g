package com.like.hrm.staff.adapter.in.web.staff.family;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.hrm.staff.application.port.in.staff.family.query.StaffFamilyQueryResultDTO;
import com.like.hrm.staff.application.port.in.staff.family.query.StaffFamilyQueryUseCase;

@RestController
public class StaffFamilyQueryController {

	private StaffFamilyQueryUseCase useCase;
	
	public StaffFamilyQueryController(StaffFamilyQueryUseCase useCase) {
		this.useCase = useCase;	
	}
	
	@GetMapping("/api/hrm/staff/{staffId}/family")
	public ResponseEntity<?> getFamilyList(@RequestParam String companyCode, @PathVariable String staffId) {
													
		List<StaffFamilyQueryResultDTO> list = useCase.select(companyCode,staffId);
		
		return toList(list, MessageUtil.getQueryMessage(list.size()));						
	}
}
