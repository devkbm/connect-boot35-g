package com.like.hrm.staff.adapter.in.web.staff;

import static com.like.core.web.util.ResponseEntityUtil.toOne;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.hrm.staff.adapter.out.db.staff.data.StaffJpaRepository;
import com.like.hrm.staff.domain.staff.StaffId;

@RestController
public class StaffFormValidController {

	private StaffJpaRepository repository;
	
	public StaffFormValidController(StaffJpaRepository repository) {
		this.repository = repository;		
	}
	
	@GetMapping("/api/hrm/staff/{staffNo}/valid")
	public ResponseEntity<?> isStaff(@RequestParam String companyCode, @PathVariable String staffNo) {
		
		boolean exist = repository.existsById(new StaffId(companyCode, staffNo));
					
		return toOne(exist, exist == true ? "직원정보가 존재합니다." : "직원정보가 존재하지 않습니다.");
	}
	
	
}
