package com.like.hrm.hrmcode.domain;

import com.like.core.jpa.domain.AbstractAuditEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "HRMRELATIONCODE")
public class HrmRelationCode extends AbstractAuditEntity {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="RELATION_ID")
	private Long relationId;
		
	/**
	 * COMCODE테이블 P_CODE 컬럼 : HRMREL 참조
	 */
	@Column(name="REL_CODE")
	private String relCode;
	
	@Column(name="PARENT_TYPE_ID")
	private String parentTypeId;
	
	@Column(name="PARENT_DETAIL_ID")
	private String parentDetailId;
	
	@Column(name="CHILD_TYPE_ID")
	private String childTypeId;
	
	@Column(name="CHILD_DETAIL_ID")
	private String childDetailId;
	
	public HrmRelationCode(String relCode
						  ,String parentTypeId
						  ,String parentDetailId
						  ,String childTypeId
						  ,String childDetailId) {
		this.relCode = relCode;
		this.parentTypeId = parentTypeId;
		this.parentDetailId = parentDetailId;
		this.childTypeId = childTypeId;		
		this.childDetailId = childDetailId;
	}	
	
}
