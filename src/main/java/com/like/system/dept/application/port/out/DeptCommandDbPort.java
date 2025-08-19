package com.like.system.dept.application.port.out;

import java.util.Optional;

import com.like.system.dept.domain.Dept;

public interface DeptCommandDbPort {

	boolean exists(String companyCode, String deptCode);
	
	Optional<Dept> select(String companyCode, String deptCode);
	
	void save(Dept entity);
	
	void delete(String companyCode, String deptCode);
}
