package com.like.hrm.payitem.domain.payinfo;

import java.math.BigDecimal;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.like.core.jpa.domain.AbstractAuditEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "HRMPAYSTAFFITEM")
@EntityListeners(AuditingEntityListener.class)
public class PayStaffItem extends AbstractAuditEntity {

	@Id
	@Column(name="PAY_STAFF_ID")
	String id;
	
	@Column(name="PAY_ITEM_CODE")
	String payItemCode;
	
	@Comment("금액")
	@Column(name="WAGE_AMOUNT")
	BigDecimal wageAmount;
		
}
