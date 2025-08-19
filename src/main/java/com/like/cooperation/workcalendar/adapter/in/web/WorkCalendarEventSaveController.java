package com.like.cooperation.workcalendar.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.cooperation.workcalendar.application.port.in.event.save.WorkCalendarEventSaveDTO;
import com.like.cooperation.workcalendar.application.port.in.event.save.WorkCalendarEventSaveUseCase;
import com.like.core.message.MessageUtil;

import jakarta.validation.Valid;

@RestController
public class WorkCalendarEventSaveController {

	WorkCalendarEventSaveUseCase useCase;
	
	WorkCalendarEventSaveController(WorkCalendarEventSaveUseCase useCase) {
		this.useCase = useCase;
	}
	
	@PostMapping("/api/grw/workcalendarevent")
	public ResponseEntity<?> saveWorkGroup(@Valid @RequestBody WorkCalendarEventSaveDTO dto) {				
		
		useCase.save(dto);		
										 					
		return toOne(dto, MessageUtil.getSaveMessage(1));
	}
}
