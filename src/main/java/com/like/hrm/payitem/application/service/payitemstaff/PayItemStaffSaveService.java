package com.like.hrm.payitem.application.service.payitemstaff;

import org.springframework.stereotype.Service;

import com.like.hrm.payitem.application.port.in.payitemstaff.save.PayItemStaffSaveDTO;
import com.like.hrm.payitem.application.port.in.payitemstaff.save.PayItemStaffSaveUseCase;
import com.like.hrm.payitem.application.port.out.PayItemStaffCommandDbPort;

@Service
public class PayItemStaffSaveService implements PayItemStaffSaveUseCase {

	PayItemStaffCommandDbPort dbPort;
	
	PayItemStaffSaveService(PayItemStaffCommandDbPort dbPort) {
		this.dbPort = dbPort;
	}
	
	@Override
	public void save(PayItemStaffSaveDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
