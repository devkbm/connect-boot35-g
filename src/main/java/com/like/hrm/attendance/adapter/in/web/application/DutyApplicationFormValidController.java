package com.like.hrm.attendance.adapter.in.web.application;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.like.hrm.attendance.adapter.out.db.application.data.AttendanceApplicationRepository;

@RestController
public class DutyApplicationFormValidController {

	private AttendanceApplicationRepository repository;
	
	public DutyApplicationFormValidController(AttendanceApplicationRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/api/hrm/dutyapplication/{id}/valid")
	public ResponseEntity<?> getDutyCode(@PathVariable(value="id") Long id) {
		
		boolean exist = repository.existsById(id);
					
		return toOne(exist, exist == true ? "사용가능한 근태 코드입니다." : "기존 근태 코드가 존재합니다.");
	}
}
