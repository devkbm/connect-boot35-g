package com.like.hrm.attendance.domain.application;

import com.like.hrm.attendance.adapter.out.db.application.DutyApplicationQueryRepository;

/**
 * 기존 입력된 근태 데이터의 기간내 중복 입력을 제한 하는 기능 
 */
public class DuplicationInputLimit implements InputLimitable {

	private DutyApplicationQueryRepository repository;
	
	public DuplicationInputLimit(DutyApplicationQueryRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public boolean isLimit(AttendanceApplication entity) {
		if (isDuplicated(entity))
			return true;
		
		return false;
	}
	
	private boolean isDuplicated(AttendanceApplication entity) {
				
		//List<DutyApplication> dutyList = repository.getDutyApplicationList(search);
		
		//for (DutyApplication duty : dutyList) {
			
			// 중복되는 근태가 있을 경우
			//if (duty.getPeriod().isBetween(entity.getPeriod()))
			//	return true;
		//}
		
		return false;
	}
	

}
