package com.like.hrm.payitem.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "HRMPAYITEMSTAFF")
@EntityListeners(AuditingEntityListener.class)
public class PayItemStaff {

	@EmbeddedId
	PayItemStaffId id;
	
	@Column(name="STF_NO")
	String staffNo;
	
	
}
