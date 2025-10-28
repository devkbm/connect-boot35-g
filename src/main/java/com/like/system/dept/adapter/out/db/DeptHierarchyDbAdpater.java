package com.like.system.dept.adapter.out.db;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.system.dept.adapter.out.db.query.DeptHierarchyQuerydsl;
import com.like.system.dept.application.port.out.DeptHierarchySelectDbPort;
import com.like.system.dept.domain.DeptHierarchy;

@Repository
public class DeptHierarchyDbAdpater implements DeptHierarchySelectDbPort {
	
	DeptHierarchyQuerydsl query;
	
	DeptHierarchyDbAdpater(DeptHierarchyQuerydsl query) {
		this.query = query;
	}
	
	@Override
	public List<DeptHierarchy> getAllNodes(String companyCode) {
		return this.query.getAllNodes(companyCode);	
	}

}
