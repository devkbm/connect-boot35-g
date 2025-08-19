package com.like.system.menu_role.domain.menu;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.like.core.jpa.domain.AbstractAuditEntity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Table(name = "commenugroup")
@EntityListeners(AuditingEntityListener.class)
public class MenuGroup extends AbstractAuditEntity implements Serializable {		
	
	private static final long serialVersionUID = -638113137072530575L;
	
	@EmbeddedId
	MenuGroupId id;
	
	@Column(name="MENU_GROUP_NM")
	String name; 
		
	@Comment("MENU_GROUP_URL")
	@Column(name="MENU_GROUP_URL")
	String menuGroupUrl;
	
	@Column(name="DESCRIPTION")
	String description;		
			
	@Column(name="SEQ")
	Long sequence;
	
	@Builder
	public MenuGroup(
			String companyCode, 
			String code, 
			String name, 
			String menuGroupUrl, 
			String description,
			Long sequence
			) {	
		this.id = new MenuGroupId(companyCode, code);
		this.name = name;
		this.menuGroupUrl = menuGroupUrl;
		this.description = description;
		this.sequence = sequence;
	}	
	
	@Builder(builderMethodName = "modifyBuilder", buildMethodName = "modify")
	public void modifyEntity(
			String menuGroupName,
			String menuGroupUrl,
			String description,
			Long sequence
			) {
		this.name = menuGroupName;
		this.menuGroupUrl = menuGroupUrl;
		this.description = description;
		this.sequence = sequence;
	}
	
}
