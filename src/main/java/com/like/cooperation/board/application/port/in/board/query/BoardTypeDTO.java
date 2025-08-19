package com.like.cooperation.board.application.port.in.board.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.like.common.dto.HtmlSelectOptionable;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum BoardTypeDTO implements HtmlSelectOptionable {
	/**
	 * 관리자만 등록가능 
	 */
	NOTICE("NOTICE","공지사항"),
	
	BOARD("BOARD","일반게시판");
	
	private String code;
	private String name;
	
	private BoardTypeDTO(final String code, final String name) {
		this.code = code;
        this.name = name;
	}
	
    public String getCode() {
        return code;
    }
    	
    public String getName() {
        return name;
    }

	@Override
	public String getLabel() {
		return name;
		
	}

	@Override
	public String getValue() {
		return code;
	}
}
