package com.like.hrm.staff.application.port.in.staff.appointment;

public interface StaffAppointmentApplyUseCase {
	void apply(String companyCode, String staffNo, Long seq);
}
