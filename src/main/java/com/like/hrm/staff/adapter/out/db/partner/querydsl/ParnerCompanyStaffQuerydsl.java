package com.like.hrm.staff.adapter.out.db.partner.querydsl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.hrm.hrmcode.domain.QHrmCode;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryDTO;
import com.like.hrm.staff.application.port.in.partner.query.PartnerCompanyStaffQueryResultDTO;
import com.like.hrm.staff.domain.partner.QPartnerCompanyStaff;
import com.like.system.dept.domain.QDept;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class ParnerCompanyStaffQuerydsl {

	private JPAQueryFactory queryFactory;	
	private final QPartnerCompanyStaff qStaff = QPartnerCompanyStaff.partnerCompanyStaff;
			
	public ParnerCompanyStaffQuerydsl(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}
	
	public List<PartnerCompanyStaffQueryResultDTO> getStaffList(PartnerCompanyStaffQueryDTO dto) {
		QDept blngDeptCode = QDept.dept;
		QDept workDeptCode = new QDept("workDeptCode");
		
		QHrmCode partnerCompanyCode = new QHrmCode("partnerCompanyCode");
				
		return queryFactory
				.select(Projections.fields(PartnerCompanyStaffQueryResultDTO.class,
						qStaff.id.companyCode,
						qStaff.id.staffNo,
						qStaff.name.name,
						qStaff.name.nameEng,
						qStaff.name.nameChi,
						qStaff.residentRegistrationNumber,
						qStaff.gender,
						qStaff.birthday,
						qStaff.imagePath,
						qStaff.partnerCompanyCode,
						partnerCompanyCode.codeName.as("partnerCompanyName"),
						qStaff.blngDeptCode,
						blngDeptCode.deptNameKorean.as("blngDeptName"),
						qStaff.workDeptCode,
						workDeptCode.deptNameKorean.as("workDeptName")
						))
				.from(qStaff)
				.leftJoin(partnerCompanyCode)
			   		.on(partnerCompanyCode.id.typeId.eq("HR0012")
			   		.and(qStaff.partnerCompanyCode.eq(partnerCompanyCode.id.code)))
				.leftJoin(blngDeptCode)
					.on(blngDeptCode.id.companyCode.eq(qStaff.id.companyCode)
		   			.and(blngDeptCode.id.deptCode.eq(qStaff.blngDeptCode)))
				.leftJoin(workDeptCode)
		   			.on(workDeptCode.id.companyCode.eq(qStaff.id.companyCode)
		   			.and(workDeptCode.id.deptCode.eq(qStaff.workDeptCode)))
				.fetch();
	}
				

}
