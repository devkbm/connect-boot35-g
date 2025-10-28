package com.like.system.menu_role.adapter.out.db.menu_role;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.system.menu_role.adapter.out.db.menu_role.querydsl.MenuGroupByRolesSelectQuerydsl;
import com.like.system.menu_role.application.port.out.menu_role.MenuGroupByRolesSelectDbPort;
import com.like.system.menu_role.domain.menu.MenuGroup;

@Repository
public class MenuGroupByRolesSelectDbAdapter implements MenuGroupByRolesSelectDbPort {

	MenuGroupByRolesSelectQuerydsl query; 
	
	MenuGroupByRolesSelectDbAdapter(MenuGroupByRolesSelectQuerydsl query) {
		this.query = query;
	}
	
	@Override
	public List<MenuGroup> select(String companyCode, List<String> roleCodes) {		
		return this.query.select(companyCode, roleCodes);				               
	}

}
