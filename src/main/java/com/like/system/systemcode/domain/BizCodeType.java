package com.like.system.systemcode.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class BizCodeType {

	BizCodeTypeId id;
	
	String name;
	
	Integer sequence;
	
	BizTypeEnum bizType;
	
	BizRuleComments ruleComments;
	
	String comment;

	@Builder
	public BizCodeType(String companyCode, String typeId, String name, BizTypeEnum bizTypeEnum, String comment) {		
		this.id = new BizCodeTypeId(companyCode, typeId);
		this.name = name;
		this.bizType = bizTypeEnum;
		this.comment = comment;
	}
	
	public void modify(String name, Integer sequence, BizRuleComments ruleComments, String comment) {
		this.name = name;		
		this.sequence = sequence;
		this.ruleComments = ruleComments;
		this.comment = comment;
	}
}
