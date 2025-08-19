package com.like.hrm.staff.adapter.in.web.staff.license;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.hrm.staff.application.port.in.staff.license.select.StaffLicenseSelectDTO;
import com.like.hrm.staff.application.port.in.staff.license.select.StaffLicenseSelectUseCase;

@RestController
public class StaffLicenseSelectController {

	private StaffLicenseSelectUseCase useCase;
		
	public StaffLicenseSelectController(StaffLicenseSelectUseCase useCase) {
		this.useCase = useCase;
	}	
	
	@GetMapping("/api/hrm/staff/{staffId}/license/{id}")
	public ResponseEntity<?> getLicense(
			@RequestParam String companyCode,
			@PathVariable String staffId,
			@PathVariable Long id
			) {
		
		StaffLicenseSelectDTO dto = useCase.select(companyCode, staffId, id); 
		
		return toOne(dto, MessageUtil.getQueryMessage(dto == null ? 0 : 1));
	}
		
	
}
