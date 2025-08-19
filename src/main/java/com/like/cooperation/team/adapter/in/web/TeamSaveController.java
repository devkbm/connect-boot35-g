package com.like.cooperation.team.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.cooperation.team.application.port.in.save.TeamSaveDTO;
import com.like.cooperation.team.application.port.in.save.TeamSaveUseCase;
import com.like.core.message.MessageUtil;

import jakarta.validation.Valid;

@RestController
public class TeamSaveController {

	TeamSaveUseCase useCase;
	
	TeamSaveController(TeamSaveUseCase useCase) {
		this.useCase = useCase;
	}
	
	@PostMapping("/api/grw/team")
	public ResponseEntity<?> saveTeam(@RequestBody @Valid TeamSaveDTO dto) {				
		 												
		useCase.save(dto);		
										 					
		return toList(null, MessageUtil.getSaveMessage(1));
	}
}
