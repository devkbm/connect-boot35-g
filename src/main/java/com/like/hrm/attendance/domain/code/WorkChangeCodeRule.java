package com.like.hrm.attendance.domain.code;

import com.like.core.jpa.domain.AbstractAuditEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "HRMDUTYCODERULE")
public class WorkChangeCodeRule extends AbstractAuditEntity {

	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="RULE_ID", nullable = false)
	private Long id;
			
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DUTY_CODE", nullable=false)
	private WorkChangeCode dutyCode;
	
	@Column(name="FK_LIMIT_ID", nullable = false)
	private Long dutyApplicationInputLimitId;
	
	public WorkChangeCodeRule(WorkChangeCode dutyCode
					   ,Long dutyApplicationInputLimitId) {
		this.dutyCode = dutyCode;
		this.dutyApplicationInputLimitId = dutyApplicationInputLimitId;
	}
		
}
