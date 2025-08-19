package com.like.system.hierarchycode.application.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.annotations.Generated;

/**
 * com.like.system.hierarchycode.application.dto.QCodeHierarchy is a Querydsl Projection type for CodeHierarchy
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QCodeHierarchy extends ConstructorExpression<CodeHierarchy> {

    private static final long serialVersionUID = 1432705402L;

    public QCodeHierarchy(com.querydsl.core.types.Expression<String> codeId, com.querydsl.core.types.Expression<String> systemTypeCode, com.querydsl.core.types.Expression<String> code, com.querydsl.core.types.Expression<String> codeName, com.querydsl.core.types.Expression<String> codeNameAbbreviation, com.querydsl.core.types.Expression<String> parentId, com.querydsl.core.types.Expression<java.time.LocalDateTime> fromDate, com.querydsl.core.types.Expression<java.time.LocalDateTime> toDate, com.querydsl.core.types.Expression<Integer> seq, com.querydsl.core.types.Expression<String> cmt) {
        super(CodeHierarchy.class, new Class<?>[]{String.class, String.class, String.class, String.class, String.class, String.class, java.time.LocalDateTime.class, java.time.LocalDateTime.class, int.class, String.class}, codeId, systemTypeCode, code, codeName, codeNameAbbreviation, parentId, fromDate, toDate, seq, cmt);
    }

}

