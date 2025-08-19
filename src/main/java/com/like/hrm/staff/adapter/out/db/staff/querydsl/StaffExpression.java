package com.like.hrm.staff.adapter.out.db.staff.querydsl;

import java.time.LocalDate;
import java.util.List;

import com.like.hrm.staff.domain.staff.Staff;
import com.querydsl.core.annotations.QueryDelegate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.DateExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.JPAExpressions;

public class StaffExpression {

	/*	
	@QueryDelegate(Staff.class)
	public static BooleanExpression referenceDate(QStaff employee, LocalDate referenceDate) {
		//DateExpression<LocalDate> now = DateExpression.currentDate(LocalDate.class);
		DateExpression<LocalDate> date = Expressions.asDate(referenceDate);
		
		QDeptChangeHistory qDeptChangeHistory = QDeptChangeHistory.deptChangeHistory;
		QJobChangeHistory qJobChangeHistory = QJobChangeHistory.jobChangeHistory;
		QStatusChangeHistory qStatusChangeHistory = QStatusChangeHistory.statusChangeHistory;				
		
		return date.between(qDeptChangeHistory.period.from, qDeptChangeHistory.period.to)
		  .and(date.between(qJobChangeHistory.period.from, qJobChangeHistory.period.to))
		  .and(date.between(qStatusChangeHistory.period.from, qStatusChangeHistory.period.to));
		  
	}
	
	@QueryDelegate(Staff.class)
	public static BooleanExpression equalDeptCode(QStaff employee, String deptType, String deptCode) {		
		
		QDeptChangeHistory qDeptChangeHistory = QDeptChangeHistory.deptChangeHistory;				
		
		return qDeptChangeHistory.deptType.eq(deptType)
		  .and(qDeptChangeHistory.deptCode.eq(deptCode));			
	}
	
	@QueryDelegate(Staff.class)
	public static BooleanExpression inDeptCode(QStaff employee, String deptType, List<String> deptCode) {		
		
		QDeptChangeHistory qDeptChangeHistory = QDeptChangeHistory.deptChangeHistory;				
		
		return qDeptChangeHistory.deptType.eq(deptType)
		  .and(qDeptChangeHistory.deptCode.in(deptCode));			
	}
	
	
	
	@QueryDelegate(Staff.class)
	public static BooleanExpression equalJobCode(QStaff employee, String jobType, String jobCode) {		
		
		QJobChangeHistory qJobChangeHistory = QJobChangeHistory.jobChangeHistory;				
		
		return qJobChangeHistory.jobType.eq(jobType)
		  .and(qJobChangeHistory.jobCode.eq(jobCode));			
	}
		
	@QueryDelegate(Staff.class)
	public static BooleanExpression likeDeptName(QStaff employee, String deptName, LocalDate date) {
		
		QDeptChangeHistory qDeptChangeHistory = QDeptChangeHistory.deptChangeHistory;
		DateExpression<LocalDate> dateExpression = Expressions.asDate(date);
		QDept qDept = QDept.dept;
		
		return JPAExpressions.select(Expressions.constant(1))
				  			 .from(qDeptChangeHistory)				  			
				  			 .join(qDept)
				  			 .on(qDeptChangeHistory.deptCode.eq(qDept.deptCode))				  			 				  			 				  		
				             .where(qDept.deptNameKorean.like(deptName)
				               .and(qDeptChangeHistory.employee.eq(employee))
				               .and(dateExpression.between(qDeptChangeHistory.period.from, qDeptChangeHistory.period.to)))
				             .exists();
	}
	*/

	/*
	@QueryDelegate(Code.class)
	public static BooleanExpression isRootNode(QCode code) {							
		return code.parentCode.isNull();
	}
	
	@QueryDelegate(Code.class)
	public static BooleanExpression isLeafNode(QCode code) {							
		return code.parentCode.isNotNull();
	}
	*/
}
