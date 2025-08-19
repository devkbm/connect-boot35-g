package com.like.system.holiday.adapter.in.web;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.system.holiday.application.port.in.query.HolidayQueryUseCase;
import com.like.system.holiday.domain.HolidayInfo;

@RestController
public class HolidayQueryController {

	private HolidayQueryUseCase useCase;
	
	public HolidayQueryController(HolidayQueryUseCase useCase) {
		this.useCase = useCase;
	}
		
	@GetMapping("/api/system/holiday")
	public ResponseEntity<?> getHolidayList(@RequestParam String companyCode
			                               ,@RequestParam @DateTimeFormat(pattern="yyyyMMdd") LocalDate fromDate
										   ,@RequestParam @DateTimeFormat(pattern="yyyyMMdd") LocalDate toDate) {
		
		List<HolidayInfo> list = useCase.select(companyCode, fromDate, toDate).getDates();			
					
		return toList(list, MessageUtil.getQueryMessage(list.size()));
	}
}
