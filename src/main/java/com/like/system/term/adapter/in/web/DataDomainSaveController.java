package com.like.system.term.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.system.term.application.dto.domain.DataDomainSaveDTO;
import com.like.system.term.application.port.in.domain.DataDomainSaveUseCase;

import jakarta.validation.Valid;

@RestController
public class DataDomainSaveController {

	DataDomainSaveUseCase useCase;
	
	DataDomainSaveController(DataDomainSaveUseCase useCase) {
		this.useCase = useCase;
	}
	
	@PostMapping("/api/system/datadomin")
	public ResponseEntity<?> save(@Valid @RequestBody DataDomainSaveDTO dto) {
														
		useCase.save(dto);										
		
		return toList(null, MessageUtil.getSaveMessage(1));
	
	}
}
