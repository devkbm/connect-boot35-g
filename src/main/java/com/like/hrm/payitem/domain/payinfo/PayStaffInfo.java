package com.like.hrm.payitem.domain.payinfo;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.like.core.jpa.domain.AbstractAuditEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Table(name = "HRMPAYSTAFF")
@EntityListeners(AuditingEntityListener.class)
public class PayStaffInfo extends AbstractAuditEntity {

	@EmbeddedId
	PayStaffInfoId id;
	
	@Embedded
	PayStaffAppointment appointment;
		
	@Comment("마감여부")
	@Column(name="CLOSE_YN")
	Boolean isClose;
	
}
