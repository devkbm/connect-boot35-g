package com.like.hrm.staff.domain.staff.appointment;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.like.core.jpa.domain.AbstractAuditEntity;
import com.like.hrm.staff.domain.staff.Staff;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true, value = {"staff"})
@ToString(exclude = {"staff"})
@EqualsAndHashCode(callSuper = false, of = {"id"})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "HRMSTAFFAPPOINTMENTRECORD")
@EntityListeners(AuditingEntityListener.class)
public class AppointmentRecord extends AbstractAuditEntity implements Serializable {

	private static final long serialVersionUID = 3842729148497015523L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "ORG_CD", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name = "STAFF_NO", nullable=false, insertable=false, updatable=false)
	})
	private Staff staff;
	
	@EmbeddedId
	AppointmentRecordId id;
		
	@Comment("발령분류코드")
	@Column(name="APPOINTMENT_TYPE_CODE")
	String appointmentTypeCode;
	
	@Comment("발령일자")
	@Column(name="APPOINTMENT_DT")
	LocalDate appointmentDate;
	
	@Comment("발령종료일자")
	@Column(name="APPOINTMENT_END_DT")
	LocalDate appointmentEndDate;
	
	@Comment("발령명")
	@Column(name="RECORD_NAME")
	String recordName;

	@Comment("비고")
	@Column(name="CMT")
	String comment;
			
	@Column(name="APPLY_TYPE_CD")
	//@Convert(converter = AppointmentApplyTypeConverter.class)
	AppointmentApplyType applyType;
	
	@Comment("완료여부")
	@Column(name="COMPLETE_YN")
	Boolean isCompleted;			
	
	@Embedded
	AppointmentInformation info;
	
	@Builder
	public AppointmentRecord(
			Staff staff,
			String appointmentTypeCode,
			AppointmentApplyType applyType,
			LocalDate appointmentDate,
			LocalDate appointmentEndDate,
			String recordName,
			String comment,
			AppointmentInformation info
			) {
		this.staff = staff;
		this.id = new AppointmentRecordId(staff, staff.getAppointmentRecordList().getNextSequence());
		this.appointmentTypeCode = appointmentTypeCode;
		this.applyType = applyType;
		this.appointmentDate = appointmentDate;
		this.appointmentEndDate = appointmentEndDate;
		this.recordName = recordName;
		this.comment = comment;
		this.info = info;
		
		this.isCompleted = false;
	}
			
	@Builder(builderMethodName = "modifyBuilder", buildMethodName = "modify")
	public void modify(
			AppointmentApplyType applyType,
			LocalDate appointmentDate,
			LocalDate appointmentEndDate,
			String recordName,
			String comment,
			AppointmentInformation info
			) {
		
		if (isCompleted == true) {
			throw new IllegalStateException("처리 완료된 발령은 수정할수 없습니다.");
		}
		
		this.applyType = applyType;
		this.appointmentDate = appointmentDate;
		this.appointmentEndDate = appointmentEndDate;
		this.recordName = recordName;
		this.info = info;
	}
	
	public void complete( ) {
		this.isCompleted = true;
	}
}
