package com.like.system.dept.adapter.out.db.query;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.like.system.dept.domain.DeptHierarchy;
import com.like.system.dept.domain.QDept;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class DeptHierarchyQuerydsl {

	JPAQueryFactory queryFactory;
	private static final QDept qDept = QDept.dept;
	
	DeptHierarchyQuerydsl(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}
	
	public List<DeptHierarchy> getAllNodes(String companyCode) {
		return queryFactory
				.select(Projections.fields(DeptHierarchy.class,
						qDept.id.companyCode,
						qDept.id.deptCode,
						qDept.deptNameKorean,
						qDept.deptAbbreviationKorean,
						qDept.deptNameEnglish,
						qDept.deptAbbreviationEnglish,
						qDept.period,
						qDept.seq,
						qDept.comment,
						qDept.parentDeptCode
						))
				.from(qDept)
				.where(qDept.id.companyCode.eq(companyCode))
				.orderBy(qDept.parentDeptCode.asc(), qDept.seq.asc())				
				.fetch();	
	}
}
