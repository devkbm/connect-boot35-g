package com.like.cooperation.todo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTodoGroup is a Querydsl query type for TodoGroup
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTodoGroup extends EntityPathBase<TodoGroup> {

    private static final long serialVersionUID = -64065798L;

    public static final QTodoGroup todoGroup = new QTodoGroup("todoGroup");

    public final com.like.core.jpa.domain.QAbstractAuditEntity _super = new com.like.core.jpa.domain.QAbstractAuditEntity(this);

    //inherited
    public final StringPath createdAppUrl = _super.createdAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDt = _super.createdDt;

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    //inherited
    public final StringPath modifiedAppUrl = _super.modifiedAppUrl;

    //inherited
    public final SimplePath<com.like.core.jpa.domain.AuditorDetails> modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDt = _super.modifiedDt;

    public final StringPath todoGroupName = createString("todoGroupName");

    public final ListPath<Todo, QTodo> todoList = this.<Todo, QTodo>createList("todoList", Todo.class, QTodo.class, PathInits.DIRECT2);

    public final StringPath userId = createString("userId");

    public QTodoGroup(String variable) {
        super(TodoGroup.class, forVariable(variable));
    }

    public QTodoGroup(Path<? extends TodoGroup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTodoGroup(PathMetadata metadata) {
        super(TodoGroup.class, metadata);
    }

}

