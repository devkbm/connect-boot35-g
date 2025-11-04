package com.like.hrm.payitem.domain.payinfo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode(of = {"companyCode","payYm","seq","staffNo"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class PayStaffInfoId implements Serializable {
	
	private static final long serialVersionUID = -5513189293265939387L;

	@Column(name="ORG_CD")
	String companyCode;
		
	@Column(name="PAY_YYYYMM")
	String payYm;
	
	@Column(name="SEQ")
	Long seq;
	
	@Column(name="STAFF_NO")
	String staffNo;
	
	public PayStaffInfoId(
			String companyCode, 
			String payYm,
			Long seq,
			String staffNo
			) {
		this.companyCode = companyCode;
		this.payYm = payYm;
		this.seq = seq;
		this.staffNo = staffNo;
	}
}
