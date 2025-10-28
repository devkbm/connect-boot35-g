package com.like.hrm.staff.application.service.partner;

import org.springframework.stereotype.Service;

import com.like.hrm.staff.application.port.in.partner.select.PartnerCompanyStaffSelectDTO;
import com.like.hrm.staff.application.port.in.partner.select.PartnerCompanyStaffSelectDTOMapper;
import com.like.hrm.staff.application.port.in.partner.select.PartnerCompanyStaffSelectUseCase;
import com.like.hrm.staff.application.port.out.partner.PartnerCompanyStaffCommandDbPort;

@Service
public class PartnerCompanyStaffSelectService implements PartnerCompanyStaffSelectUseCase {

	PartnerCompanyStaffCommandDbPort dbPort;
	
	PartnerCompanyStaffSelectService(PartnerCompanyStaffCommandDbPort dbPort) {
		this.dbPort = dbPort;
	}
	
	@Override
	public PartnerCompanyStaffSelectDTO select(String companyCode, String staffNo) {		
		return PartnerCompanyStaffSelectDTOMapper.toDTO(this.dbPort.select(companyCode, staffNo).orElse(null));
	}

}
