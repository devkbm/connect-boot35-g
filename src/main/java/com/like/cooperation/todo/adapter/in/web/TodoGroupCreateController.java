package com.like.cooperation.todo.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.like.cooperation.todo.application.port.in.group.TodoGroupCreateUseCase;
import com.like.cooperation.todo.domain.TodoGroup;
import com.like.core.util.SessionUtil;

@RestController
public class TodoGroupCreateController {

	TodoGroupCreateUseCase useCase;
	
	TodoGroupCreateController(TodoGroupCreateUseCase useCase) {
		this.useCase = useCase;
	}
	
	@PostMapping("/api/todo/group/new")
	public ResponseEntity<?> newTodoGroup() {
										
		TodoGroup todoGroup = useCase.create(SessionUtil.getUserId());										
								 					
		return toOne(todoGroup, "생성되었습니다.");
	}
}
