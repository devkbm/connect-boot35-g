package com.like.hrm.payitem.application.port.in.paytable.query;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PayTableQueryResultDTO {

	String id;
	String companyCode;
	String payItemCode;
	String payItemName;
	LocalDate effectiveDate;
	String occupationCode;
	String jobGradeCode;
	String payStepCode;
	BigDecimal wageAmount;
	Boolean isEnable;
	String comment;
	
}
