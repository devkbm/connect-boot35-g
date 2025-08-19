package com.like.hrm.staff.adapter.in.web.staff.appointment;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.hrm.staff.application.port.in.staff.appointment.StaffAppointmentApplyUseCase;

@RestController
public class StaffAppointmentApplyController {

	private StaffAppointmentApplyUseCase useCase;
	
	public StaffAppointmentApplyController(StaffAppointmentApplyUseCase useCase) {
		this.useCase = useCase;
	}	
	
	@GetMapping("/api/hrm/staff/{staffId}/appointmentrecord/{id}/apply")
	//@RequestMapping(value={"/hrm/staff/{staffId}/appointmentrecord/{id}/apply"}, method={RequestMethod.POST})	
	public ResponseEntity<?> applyAppointmentRecord(@RequestParam String companyCode
												   ,@PathVariable String staffId
 			 									   ,@PathVariable Long id) {									
						
		useCase.apply(companyCode, staffId, id);
											 				
		return toList(null, "발령처리되었습니다.");
	}
}
