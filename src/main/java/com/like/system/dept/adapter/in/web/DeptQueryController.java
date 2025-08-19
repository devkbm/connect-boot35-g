package com.like.system.dept.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.like.system.dept.application.port.in.query.DeptQueryDTO;
import com.like.system.dept.application.port.in.query.DeptQueryUseCase;
import com.like.system.dept.application.port.in.save.DeptSaveDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DeptQueryController {

	DeptQueryUseCase useCase;
	
	DeptQueryController(DeptQueryUseCase useCase) {
		this.useCase = useCase;
	}
	
	@GetMapping("/api/system/dept")
	public ResponseEntity<?> getDeptList(@ModelAttribute DeptQueryDTO dto) {
							
		log.info(dto.toString());
		
		List<DeptSaveDTO> list = useCase.select(dto);  						 						
		
		return toList(list, String.format("%d 건 조회되었습니다.", list.size()));
	}
}
