package com.like.hrm.staff.application.port.out.partner;

import java.util.List;

import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryDTO;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryResultDTO;

public interface ParnerCompanyStaffQueryDbPort {

	List<PartnerCompanyStaffQueryResultDTO> getStaffList(PartnerCompanyStaffQueryDTO dto);
	
}
