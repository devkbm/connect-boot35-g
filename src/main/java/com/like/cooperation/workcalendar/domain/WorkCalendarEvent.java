package com.like.cooperation.workcalendar.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.like.core.jpa.domain.AbstractAuditEntity;

import io.hypersistence.utils.hibernate.id.Tsid;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(exclude = {"workCalendar"})
@JsonAutoDetect(fieldVisibility=Visibility.ANY)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "GRWWORKCALENDAREVENT")
@EntityListeners(AuditingEntityListener.class)
public class WorkCalendarEvent extends AbstractAuditEntity {	

	@Id
	@Tsid
	@Column(name="ID")
	Long id;
	
	@Column(name="TITLE")
	String title;
	
	@Column(name="START_DT")
	LocalDateTime start;
	
	@Column(name="END_DT")
	LocalDateTime end;
	
	@Column(name="ALLDAY")
	Boolean allDay;	
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FK_WORKCALENDAR", nullable=false, updatable=false)
	WorkCalendar workCalendar;

	@Builder
	public WorkCalendarEvent(
			String title, 
		    LocalDateTime start, 
		    LocalDateTime end, 
	        Boolean allDay, 
	        WorkCalendar workCalendar
	        ) {
		this.title = title;
		this.start = start;
		this.end = end;
		this.allDay = allDay;
		this.workCalendar = workCalendar;		
	}

	public void modifyEntity(
			String title,
			LocalDateTime start,
			LocalDateTime end,
			Boolean allDay
			) {
		this.title = title;
		this.start = start;
		this.end = end;
		this.allDay = allDay;
	}
	
	
}
