package com.like.system.menu_role.application.port.out.menu;

import java.util.List;

import com.like.system.menu_role.domain.menu.MenuHierarchy;

public interface MenuHierarchySelectDbPort {

	List<MenuHierarchy> getAllFlattenNodes(String companyCode, String menuGroupCode);
}
