package com.like.hrm.payitem.application.port.in.payitem.query;

import lombok.Data;

@Data
public class PayItemQueryResultDTO {

	String companyCode;
	String itemCode;
	String itemName;
	String type;
	Boolean usePayTable;
	Integer seq;
	String comment;
	
}
