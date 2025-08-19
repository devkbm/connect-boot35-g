package com.like.hrm.hrmcode.application.service.depandancy;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.annotations.Generated;

/**
 * com.like.hrm.hrmcode.application.service.depandancy.QSaveHrmRelationCode is a Querydsl Projection type for SaveHrmRelationCode
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QSaveHrmRelationCode extends ConstructorExpression<SaveHrmRelationCode> {

    private static final long serialVersionUID = -987942122L;

    public QSaveHrmRelationCode(com.querydsl.core.types.Expression<Long> relationId, com.querydsl.core.types.Expression<String> relCode, com.querydsl.core.types.Expression<String> relCodeName, com.querydsl.core.types.Expression<String> parentTypeId, com.querydsl.core.types.Expression<String> parentTypeName, com.querydsl.core.types.Expression<String> parentDetailId, com.querydsl.core.types.Expression<String> parentDetailName, com.querydsl.core.types.Expression<String> childTypeId, com.querydsl.core.types.Expression<String> childTypeName, com.querydsl.core.types.Expression<String> childDetailId, com.querydsl.core.types.Expression<String> childDetailName) {
        super(SaveHrmRelationCode.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, relationId, relCode, relCodeName, parentTypeId, parentTypeName, parentDetailId, parentDetailName, childTypeId, childTypeName, childDetailId, childDetailName);
    }

}

