package com.like.hrm.hrmcode.adapter.in.web.hrmcode;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.hrm.hrmcode.application.dto.hrmcode.HrmCodeSelectDTO;
import com.like.hrm.hrmcode.application.port.in.hrmcode.HrmCodeSelectUseCase;

@RestController
public class HrmCodeSelectController {

	HrmCodeSelectUseCase useCase;
	
	HrmCodeSelectController(HrmCodeSelectUseCase useCase) {
		this.useCase = useCase;
	}
	
	@GetMapping("/api/hrm/hrmtype/{type}/code/{code}")
	public ResponseEntity<?> getTypeDetailCode(@PathVariable String type, @PathVariable String code) {
		
		HrmCodeSelectDTO dto = useCase.select(type, code);
					
		return toOne(dto, MessageUtil.getQueryMessage(dto == null ? 0 : 1));
	}
}
