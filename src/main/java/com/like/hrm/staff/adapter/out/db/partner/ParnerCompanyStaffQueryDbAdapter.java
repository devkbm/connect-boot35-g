package com.like.hrm.staff.adapter.out.db.partner;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.hrm.staff.adapter.out.db.partner.querydsl.ParnerCompanyStaffQuerydsl;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryDTO;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryResultDTO;
import com.like.hrm.staff.application.port.out.partner.ParnerCompanyStaffQueryDbPort;

@Repository
public class ParnerCompanyStaffQueryDbAdapter implements ParnerCompanyStaffQueryDbPort {

	ParnerCompanyStaffQuerydsl repository;
	
	ParnerCompanyStaffQueryDbAdapter(ParnerCompanyStaffQuerydsl repository) {
		this.repository = repository;
	}
	
	@Override
	public List<PartnerCompanyStaffQueryResultDTO> getStaffList(PartnerCompanyStaffQueryDTO dto) {
		return this.repository.getStaffList(dto);
	}

}
