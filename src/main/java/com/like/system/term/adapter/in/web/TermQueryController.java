package com.like.system.term.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.like.common.dto.HtmlSelectOptionRecord;
import com.like.common.dto.HtmlSelectOptionable;
import com.like.core.message.MessageUtil;
import com.like.system.term.application.dto.term.TermQueryDTO;
import com.like.system.term.application.dto.term.TermSaveDTO;
import com.like.system.term.application.port.in.term.TermQueryUseCase;
import com.like.system.term.domain.SystemType;

@RestController
public class TermQueryController {

	private TermQueryUseCase useCase;
	
	public TermQueryController(TermQueryUseCase useCase) {
		this.useCase = useCase;
	}
	
	@GetMapping("/api/system/terms")
	public ResponseEntity<?> getTermList(TermQueryDTO dto) {
				
		List<TermSaveDTO> list = useCase.select(dto); 							
							
		return toList(list, MessageUtil.getQueryMessage(list.size()));
	}
	
	@GetMapping("/api/system/terms/systemType")
	public ResponseEntity<?> getSystemTypeList() {				
		
		List<HtmlSelectOptionRecord> list = HtmlSelectOptionable.fromEnum(SystemType.class);  // HtmlSelectOptionRecord.fromEnum(SystemType.class);			
		
		return toList(list, MessageUtil.getQueryMessage(list.size()));
	}
}
