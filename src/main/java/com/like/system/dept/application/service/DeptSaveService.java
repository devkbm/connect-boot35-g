package com.like.system.dept.application.service;

import org.springframework.stereotype.Service;

import com.like.system.dept.application.port.in.save.DeptSaveDTO;
import com.like.system.dept.application.port.in.save.DeptSaveDTOMapper;
import com.like.system.dept.application.port.in.save.DeptSaveUseCase;
import com.like.system.dept.application.port.out.DeptCommandDbPort;
import com.like.system.dept.domain.Dept;

@Service
public class DeptSaveService implements DeptSaveUseCase {

	DeptCommandDbPort dbPort;
	
	DeptSaveService(DeptCommandDbPort dbPort) {
		this.dbPort = dbPort;
	}
	
	@Override
	public boolean exists(String companyCode, String deptCode) {
		return this.dbPort.exists(companyCode, deptCode);
	}

	@Override
	public void save(DeptSaveDTO dto) {
		Dept parent = dbPort.select(dto.companyCode(), dto.parentDeptCode()).orElse(null);
		
		this.dbPort.save(DeptSaveDTOMapper.toEntity(dto, parent));
	}

}
