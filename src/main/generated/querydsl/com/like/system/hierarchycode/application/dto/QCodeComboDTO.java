package com.like.system.hierarchycode.application.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.annotations.Generated;

/**
 * com.like.system.hierarchycode.application.dto.QCodeComboDTO is a Querydsl Projection type for CodeComboDTO
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QCodeComboDTO extends ConstructorExpression<CodeComboDTO> {

    private static final long serialVersionUID = 751141260L;

    public QCodeComboDTO(com.querydsl.core.types.Expression<String> code, com.querydsl.core.types.Expression<String> codeName, com.querydsl.core.types.Expression<String> codeNameAbbr) {
        super(CodeComboDTO.class, new Class<?>[]{String.class, String.class, String.class}, code, codeName, codeNameAbbr);
    }

}

