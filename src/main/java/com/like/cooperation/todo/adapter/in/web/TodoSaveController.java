package com.like.cooperation.todo.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.cooperation.todo.application.port.in.todo.TodoSaveDTO;
import com.like.cooperation.todo.application.port.in.todo.TodoSaveUseCase;
import com.like.core.message.MessageUtil;

import jakarta.validation.Valid;

@RestController
public class TodoSaveController {

	TodoSaveUseCase useCase;
	
	TodoSaveController(TodoSaveUseCase useCase) {
		this.useCase = useCase;
	}
	
	@PostMapping("/api/todo/group/todo")
	public ResponseEntity<?> saveTodo(@RequestBody @Valid TodoSaveDTO dto) {								
			
		TodoSaveDTO todo = useCase.save(dto);
																				 			
		return toOne(todo, MessageUtil.getSaveMessage(1));
	}
}
