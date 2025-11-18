package com.like.hrm.staff.application.port.in.partner.query;

import java.util.List;

public interface ParnerCompanyStaffQueryUseCase {

	List<PartnerCompanyStaffQueryResultDTO> getStaffList(PartnerCompanyStaffQueryDTO dto);
	
}
