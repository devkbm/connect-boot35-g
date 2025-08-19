package com.like.hrm.attendance.domain.code;

import java.util.List;
import java.util.stream.Collectors;

import com.like.core.jpa.domain.AbstractAuditEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "HRMDUTYCODE")
public class WorkChangeCode extends AbstractAuditEntity {

	@Id		
	@Column(name="DUTY_CODE", nullable = false)
	private String dutyCode;
	
	@Column(name="DUTY_NAME", nullable = false)
	private String dutyName;
	
	@Column(name="ENABLE_YN", nullable = false)
	private Boolean enabled;
	
	@Column(name="DUTY_GROUP", nullable = false)
	private String dutyGroup;
		
	// 경조비 대상 여부
	@Column(name="FAMILY_EVENT_YN", nullable = false)
	private Boolean isFamilyEvent;
	
	// 경조비 지급 금액
	@Column(name="FAMILY_EVENT_AMT", nullable = true)
	private Long familyEventAmt;		
	
	@Column(name = "CMT", nullable = true)
	private String comment;
	
	@OneToMany(mappedBy = "dutyCode", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<WorkChangeCodeRule> dutyCodeRule;
	
	@Builder
	public WorkChangeCode(String dutyCode
				   ,String dutyName
				   ,Boolean enabled
				   ,String dutyGroup
				   ,Boolean isFamilyEvent
				   ,Long familyEventAmt
				   ,String comment
				   ,List<Long> dutyApplicationInputLimitIdList) {		
		this.dutyCode = dutyCode;
		this.dutyName = dutyName;
		this.enabled = enabled;
		this.dutyGroup = dutyGroup;
		this.isFamilyEvent = isFamilyEvent;
		this.familyEventAmt = familyEventAmt;
		this.comment = comment;		
		if (dutyApplicationInputLimitIdList != null) {			
			this.dutyCodeRule = dutyApplicationInputLimitIdList.stream()
															   .map(e-> new WorkChangeCodeRule(this, e))
															   .collect(Collectors.toList());
		}
	}
	
	public void modifyEntity(String dutyName
							,Boolean enabled
							,String dutyGroup
							,Boolean isFamilyEvent
							,Long familyEventAmt
							,String comment) {
		this.dutyName = dutyName;
		this.enabled = enabled;
		this.dutyGroup = dutyGroup;
		this.isFamilyEvent = isFamilyEvent;
		this.familyEventAmt = familyEventAmt;
		this.comment = comment;
	}
	
	public boolean containDutyApplicationInputLimit(Long id) {
		return this.dutyCodeRule.stream()
								.filter(e -> e.getDutyApplicationInputLimitId().equals(id))
								.count() > 1 ? true : false;
	}
	
	public void addDutyCodeRule(Long dutyApplicationInputLimitId) {
		this.dutyCodeRule.add(new WorkChangeCodeRule(this, dutyApplicationInputLimitId));
	}
	
	public void removeDutyCodeRule(Long dutyApplicationInputLimitId) {
		this.dutyCodeRule.removeIf(e -> e.getId().equals(dutyApplicationInputLimitId));
	}
	
}
