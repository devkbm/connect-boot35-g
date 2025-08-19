package com.like.cooperation.workcalendar.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.like.cooperation.workcalendar.application.port.in.event.delete.WorkCalendarEventDeleteUseCase;
import com.like.core.message.MessageUtil;

@RestController
public class WorkCalendarEventDeleteController {

	WorkCalendarEventDeleteUseCase useCase;
	
	WorkCalendarEventDeleteController(WorkCalendarEventDeleteUseCase useCase) {
		this.useCase = useCase;
	}
	
	@DeleteMapping("/api/grw/workcalendarevent/{id}")
	public ResponseEntity<?> deleteSchedule(@PathVariable Long id) {
						
		useCase.delete(id);							
				
		return toList(null, MessageUtil.getDeleteMessage(1));													
	}
}
