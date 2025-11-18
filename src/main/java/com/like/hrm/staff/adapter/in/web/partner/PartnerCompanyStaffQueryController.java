package com.like.hrm.staff.adapter.in.web.partner;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.hrm.staff.application.port.in.partner.query.ParnerCompanyStaffQueryUseCase;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryDTO;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryResultDTO;

@RestController
public class PartnerCompanyStaffQueryController {
	
	ParnerCompanyStaffQueryUseCase useCase;
	
	PartnerCompanyStaffQueryController(ParnerCompanyStaffQueryUseCase useCase) {
		this.useCase = useCase;		
	}
	
	@GetMapping("/api/hrm/partnerstaff")
	public ResponseEntity<?> getStaffList(PartnerCompanyStaffQueryDTO dto) {
									
		List<PartnerCompanyStaffQueryResultDTO> list = useCase.getStaffList(dto); 
		
		return toList(list, MessageUtil.getQueryMessage(list.size()));
	}
	
}
