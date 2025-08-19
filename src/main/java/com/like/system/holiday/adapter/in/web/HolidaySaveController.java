package com.like.system.holiday.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.system.holiday.application.port.in.save.HolidaySaveDTO;
import com.like.system.holiday.application.port.in.save.HolidaySaveUseCase;

@RestController
public class HolidaySaveController {

	private HolidaySaveUseCase useCase;			
	
	public HolidaySaveController(HolidaySaveUseCase useCase) {
		this.useCase = useCase;			
	}			
		
	@PostMapping("/api/system/holiday")
	public ResponseEntity<?> saveHoliday(@RequestBody HolidaySaveDTO dto) {							
																	
		useCase.save(dto);
								 					
		return toList(null,MessageUtil.getSaveMessage(1));
	}	
}
