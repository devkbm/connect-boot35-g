package com.like.cooperation.todo.adapter.out.db.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.ListQuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.like.cooperation.todo.domain.Todo;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo,Long> , ListQuerydslPredicateExecutor<Todo> {

}
