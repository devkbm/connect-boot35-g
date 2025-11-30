package com.like.system.dept.application.service;

import org.jmolecules.architecture.hexagonal.Application;
import org.springframework.stereotype.Service;

import com.like.system.dept.application.port.in.select.DeptSelectDTO;
import com.like.system.dept.application.port.in.select.DeptSelectDTOMapper;
import com.like.system.dept.application.port.in.select.DeptSelectUseCase;
import com.like.system.dept.application.port.out.DeptCommandDbPort;
import com.like.system.dept.domain.Dept;

@Application
@Service
public class DeptSelectService implements DeptSelectUseCase {

	DeptCommandDbPort dbPort;

	DeptSelectService(DeptCommandDbPort dbPort) {
		this.dbPort = dbPort;
	}
	
	@Override
	public DeptSelectDTO select(String companyCode, String deptCode) {
		Dept entity = this.dbPort.select(companyCode, deptCode).orElse(null);
		
		return DeptSelectDTOMapper.toDTO(entity);
	}
	
	
}
