package com.like.hrm.staff.adapter.in.web.staff;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.hrm.staff.application.port.in.staff.contact.select.StaffContactSelectDTO;
import com.like.hrm.staff.application.port.in.staff.contact.select.StaffContractSelectUseCase;

@RestController
public class StaffContactSelectController {

	private StaffContractSelectUseCase useCase;
	
	public StaffContactSelectController(StaffContractSelectUseCase useCase) {
		this.useCase = useCase;
	}
	
	@GetMapping("/api/hrm/staff/{staffId}/contact")
	public ResponseEntity<?> getAppointmentRecordList(@RequestParam String companyCode, @PathVariable String staffId) {
										
		StaffContactSelectDTO dto = useCase.select(companyCode, staffId);										  									
		
		return toOne(dto, MessageUtil.getQueryMessage(dto == null ? 0 : 1));
	}
	
}
