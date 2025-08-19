package com.like.system.menu_role.domain.menu;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.like.core.jpa.domain.AbstractAuditEntity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonIgnoreProperties(value = { "menuGroup" })
@Entity
@Getter
@Table(name = "commenu")
@EntityListeners(AuditingEntityListener.class)
public class Menu extends AbstractAuditEntity implements Serializable {			
	
	private static final long serialVersionUID = -8469789281288988098L;
	
	@EmbeddedId
	MenuId id;
	
	@Comment("메뉴명")
	@Column(name="MENU_NM")
	String name; 		
				
	@Enumerated(EnumType.STRING)
	@JsonFormat(shape = JsonFormat.Shape.OBJECT)
	@Comment("메뉴분류")
	@Column(name="MENU_TYPE")
	MenuType type;
	
	@Comment("APP URL")
	@Column(name="APP_URL")
	String appUrl;
	
	@Embedded
	MenuAppIcon appIcon;	
	
	@Comment("순번")
	@Column(name="SEQ")
	long sequence;
	
	@Comment("계층")
	@Column(name="LVL")
	long level;
	
	
	@OneToOne(optional = true)
	@JoinColumns({
		@JoinColumn(name = "ORG_CD", insertable = false, updatable=false),
		@JoinColumn(name = "MENU_GROUP_CD", insertable = false, updatable=false),
		@JoinColumn(name = "P_MENU_CD", insertable = false, updatable=false )
	})	
	Menu parent;
	
	@Column(name="P_MENU_CD")
	String parentMenuCode;
					
	@ManyToOne
	@MapsId("menuGroupId") 	
	@JoinColumns({
		@JoinColumn(name="org_cd", referencedColumnName = "ORG_CD"),
        @JoinColumn(name="menu_group_cd", referencedColumnName = "MENU_GROUP_CD")		
	})	
	MenuGroup menuGroup;	
		
	@Builder
	public Menu(						
			@NonNull MenuGroup menuGroup,
			Menu parent,
			String companyCode,
			String menuCode, 
			String menuName, 				 			
			MenuType menuType,
			String appUrl,
			MenuAppIcon appIcon,
			long sequence,
			long level
			) {
		
		this.id = new MenuId(companyCode, menuGroup.getId().getMenuGroupCode(), menuCode);
		this.parent = parent == null ? null : parent;
		this.parentMenuCode = parent == null ? null : parent.getId().getMenuCode();
		
		this.name = menuName;			
		this.type = menuType;
		this.sequence = sequence;
		this.level = level;
		this.menuGroup = menuGroup;
		this.appUrl = appUrl;
		this.appIcon = appIcon;
	}
	
	@Builder(builderMethodName = "modifyBuilder", buildMethodName = "modify")
	public void modifyEntity(
			String menuName,
			MenuType menuType,
			String appUrl,
			MenuAppIcon appIcon,
			long sequence,
			long level,
			Menu parent,
			MenuGroup menuGroup
			) {
		this.name = menuName;
		this.type = menuType;
		this.sequence = sequence;
		this.level = level;
		this.parent = parent;
		this.parentMenuCode = parent.getId().getMenuCode();
		this.menuGroup = menuGroup;
		this.appUrl = appUrl;
		this.appIcon = appIcon;
	}
							
	public void setMenuGroup(MenuGroup menuGroup) {
		this.menuGroup = menuGroup;
	}
	
	public void registerAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

}
