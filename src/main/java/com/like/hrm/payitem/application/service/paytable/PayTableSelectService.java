package com.like.hrm.payitem.application.service.paytable;

import org.springframework.stereotype.Service;

import com.like.hrm.payitem.application.port.in.paytable.save.PayTableSaveDTO;
import com.like.hrm.payitem.application.port.in.paytable.save.PayTableSaveDTOMapper;
import com.like.hrm.payitem.application.port.in.paytable.select.PayTableSelectUseCase;
import com.like.hrm.payitem.application.port.out.PayTableCommandDbPort;

@Service
public class PayTableSelectService implements PayTableSelectUseCase {

	PayTableCommandDbPort dbPort;
	
	PayTableSelectService(PayTableCommandDbPort dbPort) {
		this.dbPort = dbPort;
	}
		
	@Override
	public PayTableSaveDTO select(String id) {		
		return PayTableSaveDTOMapper.toDTO(this.dbPort.select(id).orElse(null));
	}

}
