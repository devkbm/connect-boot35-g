package com.like.system.dept.application.port.out;

import java.util.List;

import com.like.system.dept.application.port.in.query.DeptQueryDTO;
import com.like.system.dept.domain.Dept;

public interface DeptQueryDbPort {
	
	List<Dept> select(DeptQueryDTO dto);
}
