package com.like.hrm.payitem.domain.payinfo;

import java.math.BigDecimal;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.like.core.jpa.domain.AbstractAuditEntity;

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
@Table(name = "HRMPAYSTAFFITEM")
@EntityListeners(AuditingEntityListener.class)
public class PayStaffItem extends AbstractAuditEntity {

	@EmbeddedId	
	PayStaffItemId id;
	
	@Comment("금액")
	@Column(name="WAGE_AMOUNT")
	BigDecimal wageAmount;
}
