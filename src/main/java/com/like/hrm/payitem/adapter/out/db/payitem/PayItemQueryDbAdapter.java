package com.like.hrm.payitem.adapter.out.db.payitem;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.hrm.payitem.adapter.out.db.payitem.querydsl.PayItemQuerydsl;
import com.like.hrm.payitem.application.port.in.payitem.query.PayItemQueryDTO;
import com.like.hrm.payitem.application.port.in.payitem.query.PayItemQueryResultDTO;
import com.like.hrm.payitem.application.port.out.PayItemQueryDbPort;

@Repository
public class PayItemQueryDbAdapter implements PayItemQueryDbPort {

	PayItemQuerydsl query;
	
	PayItemQueryDbAdapter(PayItemQuerydsl query) {
		this.query = query;
	}
	
	@Override
	public List<PayItemQueryResultDTO> query(PayItemQueryDTO dto) {
		return this.query.query(dto);		
	}

}
