package com.like.hrm.staff.application.service.partner;

import java.util.List;

import org.springframework.stereotype.Service;

import com.like.hrm.staff.application.port.in.partner.query.ParnerCompanyStaffQueryUseCase;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryDTO;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryResultDTO;
import com.like.hrm.staff.application.port.out.partner.ParnerCompanyStaffQueryDbPort;

@Service
public class ParnerCompanyStaffQueryService implements ParnerCompanyStaffQueryUseCase {
	
	ParnerCompanyStaffQueryDbPort dbPort;
	
	ParnerCompanyStaffQueryService(ParnerCompanyStaffQueryDbPort dbPort) {
		this.dbPort = dbPort;
	}

	@Override
	public List<PartnerCompanyStaffQueryResultDTO> getStaffList(PartnerCompanyStaffQueryDTO dto) {
		return this.dbPort.getStaffList(dto);
	}

}
