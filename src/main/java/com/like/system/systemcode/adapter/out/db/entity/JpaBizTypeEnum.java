package com.like.system.systemcode.adapter.out.db.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.like.common.dto.HtmlSelectOptionable;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum JpaBizTypeEnum implements HtmlSelectOptionable {
	HRM("인사관리"),
	GROUPWARE("그룹웨어"),
	SYSTEM("시스템")
	;

	private String name;
	
	private JpaBizTypeEnum(final String name) {
		this.name = name;
	}
	
	@Override
	public String getLabel() {
		return name;
	}

	@Override
	public String getValue() {
		return this.toString();
	}
}

