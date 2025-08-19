package com.like.system.menu_role.domain.menu_role;

import java.io.Serializable;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"companyCode", "menuGroupCode", "menuCode", "roleCode"})
@Embeddable
public class MenuRoleMappingId implements Serializable {
	
	private static final long serialVersionUID = -128283423937776316L;

	@Column(name="ORG_CD")
	String companyCode;
		
	@Column(name="MENU_GROUP_CD")
	String menuGroupCode;
	
	@Column(name="MENU_CD")
	String menuCode;
	
	@Comment("메뉴코드")
	@Column(name="ROLE_CD")
	String roleCode;
	
	protected MenuRoleMappingId() {}
	
	public MenuRoleMappingId(String companyCode, String menuGroupCode, String menuCode, String roleCode) {			
		this.companyCode = companyCode;
		this.menuGroupCode = menuGroupCode;
		this.menuCode = menuCode;
		this.roleCode = roleCode;
	}
}
