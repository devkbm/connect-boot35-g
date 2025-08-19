package com.like.system.dept.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.like.system.dept.application.port.in.hierarchy.DeptHierarchyNgZorro;
import com.like.system.dept.application.port.in.hierarchy.DeptHierarchyQueryDTO;
import com.like.system.dept.application.port.in.hierarchy.DeptHierarchyQueryUseCase;
import com.like.system.dept.application.port.out.DeptHierarchySelectDbPort;
import com.like.system.dept.domain.DeptHierarchy;
import com.like.system.dept.domain.DeptHierarchyGenerator;

@Transactional(readOnly = true)
@Service
public class DeptHierarchySelectService implements DeptHierarchyQueryUseCase {

	DeptHierarchySelectDbPort repository;
			
	public DeptHierarchySelectService(DeptHierarchySelectDbPort repository) {
		this.repository = repository;
	}		

	@Override
	public List<?> query(DeptHierarchyQueryDTO dto) {
		
		String comanyCode = dto.company() == null ? dto.companyCode() : dto.company();

		DeptHierarchyGenerator generator = new DeptHierarchyGenerator(this.repository.getAllNodes(comanyCode));
		
		List<DeptHierarchy> list = generator.getTreeNodes();		
		
		List<DeptHierarchyNgZorro> after_list = new ArrayList<>();
		
		copyTreeNodes(list, after_list);
		
		return after_list;		
	}
	
	private void copyTreeNodes(List<DeptHierarchy> original_list, List<DeptHierarchyNgZorro> copy_list) {
		DeptHierarchyNgZorro newNode = null;
		
		for (DeptHierarchy node: original_list) {
			newNode = convert(node);
			copyChildren(newNode, node);			
			copy_list.add(newNode);		
		}
	}
	
	private void copyChildren(DeptHierarchyNgZorro parent, DeptHierarchy orignal) {			
		DeptHierarchyNgZorro newNode = null;
		
		if (orignal.getChildren() == null) return;
		
		for (DeptHierarchy node: orignal.getChildren()) {
			newNode = convert(node);
			if (parent.getChildren() == null) parent.setChildren(new ArrayList<>());
			
			parent.getChildren().add(newNode);
			copyChildren(newNode, node);
		}
	}
	
	private DeptHierarchyNgZorro convert(DeptHierarchy dto) {
		return DeptHierarchyNgZorro.build(dto);
	}	
	
}
