package com.like.hrm.payitem.application.service.paytable;

import org.springframework.stereotype.Service;

import com.like.hrm.payitem.application.port.in.paytable.save.PayTableSaveDTO;
import com.like.hrm.payitem.application.port.in.paytable.save.PayTableSaveDTOMapper;
import com.like.hrm.payitem.application.port.in.paytable.save.PayTableSaveUseCase;
import com.like.hrm.payitem.application.port.out.PayTableCommandDbPort;
import com.like.hrm.payitem.domain.PayTable;

@Service
public class PayTableSaveService implements PayTableSaveUseCase {
   
	PayTableCommandDbPort dbPort;
	
	PayTableSaveService(PayTableCommandDbPort dbPort) {
		this.dbPort = dbPort;	
	}
	
	@Override
	public void save(PayTableSaveDTO dto) {
		
		String id = dto.id();
		PayTable entity = null;
		
		if (id == null) {
			entity = PayTableSaveDTOMapper.newEnity(dto);
		} else {
			entity = this.dbPort.select(dto.id()).orElse(null);
			
			entity = PayTableSaveDTOMapper.modify(entity, dto);
		}
			
		this.dbPort.save(entity);		
	}

}
