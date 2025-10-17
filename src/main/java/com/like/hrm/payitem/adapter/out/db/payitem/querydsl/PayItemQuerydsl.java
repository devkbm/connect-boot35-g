package com.like.hrm.payitem.adapter.out.db.payitem.querydsl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.hrm.payitem.application.port.in.payitem.query.PayItemQueryDTO;
import com.like.hrm.payitem.application.port.in.payitem.query.PayItemQueryResultDTO;
import com.like.hrm.payitem.domain.QPayItem;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class PayItemQuerydsl {

	final QPayItem qPayTime = QPayItem.payItem;
	
	JPAQueryFactory queryFactory;
	
	PayItemQuerydsl(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}
		
	public List<PayItemQueryResultDTO> query(PayItemQueryDTO dto) {
		return queryFactory
				.select(
					Projections.fields(
						PayItemQueryResultDTO.class,						
						qPayTime.id.companyCode.as("companyCode"),
						qPayTime.id.payItemCode.as("payItemCode"),
						qPayTime.payItemName,
						qPayTime.type,
						qPayTime.usePayTable,
						qPayTime.seq,						
						qPayTime.comment							
					)
				)
				.from(qPayTime)
				.fetch();	
	}

}
