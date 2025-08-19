package com.like.system.systemcode.adapter.out.db.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode(of = {"bizCodeTypeId", "code"})
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Embeddable
public class JpaBizCodeId implements Serializable {
	
	private static final long serialVersionUID = 3428517048766851878L;

	JpaBizCodeTypeId bizCodeTypeId;	
		
	@Column(name="CODE")
	String code;	
	
	public JpaBizCodeId(String companyCode, String typeId, String code) {
		this.bizCodeTypeId = new JpaBizCodeTypeId(companyCode, typeId);		
		this.code = code;
	}
}
