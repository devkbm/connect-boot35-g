package com.like.hrm.staff.application.port.in.partner.save;

import com.like.hrm.staff.domain.partner.PartnerCompanyStaff;
import com.like.hrm.staff.domain.staff.StaffName;
import com.like.hrm.staff.domain.staff.StaffNoCreateStrategy;

public class PartnerCompanyStaffSaveDTOMapper {

	public static PartnerCompanyStaff create(PartnerCompanyStaffSaveDTO dto) {
		
		StaffNoCreateStrategy strategy = () -> dto.staffNo();
		
		return new PartnerCompanyStaff(
				dto.companyCode(), 
				strategy, 
				new StaffName(dto.name(), dto.nameEng(), dto.nameEng()), 
				dto.gender(),
				dto.birthday(),
				dto.partnerCompanyCode(),
				dto.joinDate(),
				dto.retireDate(),
				dto.blngDeptCode(),
				dto.workDeptCode()
				);
	}
	
	public static void modify(PartnerCompanyStaff entity, PartnerCompanyStaffSaveDTO dto) {
		entity.modify(
				new StaffName(dto.name(), dto.nameEng(), dto.nameEng()), 
				dto.gender(),
				dto.birthday(),
				dto.partnerCompanyCode(),
				dto.joinDate(),
				dto.retireDate(),
				dto.blngDeptCode(),
				dto.workDeptCode()
				);
	}
	
	public static PartnerCompanyStaffSaveDTO toDTO(PartnerCompanyStaff entity) {
		if (entity == null) return null;
		
		return PartnerCompanyStaffSaveDTO
				.builder()
				.companyCode(entity.getId().companyCode())
				.staffNo(entity.getId().staffNo())
				.name(entity.getName().getName())
				.nameEng(entity.getName().getNameEng())
				.nameChi(entity.getName().getNameChi())
				.gender(entity.getGender())
				.birthday(entity.getBirthday())
				.partnerCompanyCode(entity.getPartnerCompanyCode())
				.joinDate(entity.getJoinDate())
				.retireDate(entity.getRetireDate())
				.blngDeptCode(entity.getBlngDeptCode())
				.workDeptCode(entity.getWorkDeptCode())
				.build(); 
	}	
	
}
