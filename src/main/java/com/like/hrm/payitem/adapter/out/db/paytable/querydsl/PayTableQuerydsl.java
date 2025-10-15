package com.like.hrm.payitem.adapter.out.db.paytable.querydsl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.hrm.payitem.application.port.in.paytable.query.PayTableQueryDTO;
import com.like.hrm.payitem.application.port.in.paytable.query.PayTableQueryResultDTO;
import com.like.hrm.payitem.domain.QPayTable;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class PayTableQuerydsl {

	final QPayTable qPayTable = QPayTable.payTable;
	
	JPAQueryFactory queryFactory;
	
	PayTableQuerydsl(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}
	
	public List<PayTableQueryResultDTO> query(PayTableQueryDTO dto) {
		return this.queryFactory
				.select(
					Projections.fields(
						PayTableQueryResultDTO.class,
						qPayTable.id.stringValue().as("id"),
						qPayTable.companyCode,
						qPayTable.payItemCode,
						qPayTable.payItemCode.as("payItemName"),
						qPayTable.effectiveDate,
						qPayTable.occupationCode,
						qPayTable.jobGradeCode,
						qPayTable.payStepCode,
						qPayTable.wageAmount,
						qPayTable.isEnable,
						qPayTable.comment							
					)
				)
				.from(qPayTable)
				.fetch();
	}
}
