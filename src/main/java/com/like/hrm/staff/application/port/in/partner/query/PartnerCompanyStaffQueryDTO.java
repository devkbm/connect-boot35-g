package com.like.hrm.staff.application.port.in.partner.query;


public record PartnerCompanyStaffQueryDTO(
		String companyCode,
		String staffNo,
		String name,		
		String partnerCompanyCode
		) {
		
}