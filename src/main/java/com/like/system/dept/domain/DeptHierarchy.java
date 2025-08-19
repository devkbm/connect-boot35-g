package com.like.system.dept.domain;

import java.util.List;

import com.like.common.vo.LocalDatePeriod;

import lombok.Getter;

@Getter
public class DeptHierarchy {

	String companyCode;	
	
	String deptCode;
		
	String deptNameKorean;
	
	String deptAbbreviationKorean;
	
	String deptNameEnglish;
	
	String deptAbbreviationEnglish;
	
	LocalDatePeriod period;
	
	Integer seq;
	
	String comment;
	
	String parentDeptCode;
	
	List<DeptHierarchy> children;
	
	boolean isLeaf;
		
	public DeptHierarchy() {}
	
	/**
	 * @param companyCode
	 * @param deptCode
	 * @param deptNameKorean
	 * @param deptAbbreviationKorean
	 * @param deptNameEnglish
	 * @param deptAbbreviationEnglish
	 * @param period
	 * @param seq
	 * @param comment
	 * @param parentDeptCode
	 * @param children
	 */
	public DeptHierarchy(
			String companyCode, 
			String deptCode, 
			String deptNameKorean,
			String deptAbbreviationKorean, 
			String deptNameEnglish, 
			String deptAbbreviationEnglish,
			LocalDatePeriod period, 
			Integer seq, 
			String comment, 
			String parentDeptCode, 
			List<DeptHierarchy> children
			) {
		this.companyCode = companyCode;		
		this.deptCode = deptCode;
		this.deptNameKorean = deptNameKorean;
		this.deptAbbreviationKorean = deptAbbreviationKorean;
		this.deptNameEnglish = deptNameEnglish;
		this.deptAbbreviationEnglish = deptAbbreviationEnglish;
		this.period = period;
		this.seq = seq;
		this.comment = comment;
		
		this.parentDeptCode = parentDeptCode;
		this.children = children;				
	}
	
	public String parentDeptCode() {
		return this.parentDeptCode;
	}
	
	public List<DeptHierarchy> getChildren() {
		return this.children;
	}

	public void setChildren(List<DeptHierarchy> children) {
		this.children = children;
	}
	
	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	
}
