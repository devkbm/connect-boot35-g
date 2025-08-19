package com.like.cooperation.workcalendar.application.service;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.like.cooperation.workcalendar.domain.WorkCalendarEvent;
import com.like.cooperation.workcalendar.adapter.out.db.data.WorkCalendarEventJpaRepository;
import com.like.cooperation.workcalendar.adapter.out.db.data.WorkCalendarJpaRepository;
import com.like.cooperation.workcalendar.application.port.in.event.save.WorkCalendarEventSaveDTO;
import com.like.cooperation.workcalendar.domain.WorkCalendar;

@Service
@Transactional
public class WorkCalendarEventService {

	private WorkCalendarEventJpaRepository repository;
	private WorkCalendarJpaRepository workGroupRepository;
	
	public WorkCalendarEventService(WorkCalendarEventJpaRepository repository
						  ,WorkCalendarJpaRepository workGroupRepository) {
		this.repository = repository;
		this.workGroupRepository = workGroupRepository;
	}
	
	public WorkCalendarEvent getSchedule(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void saveSchedule(WorkCalendarEvent schedule) {
		repository.save(schedule);
	}
	
	public void saveSchedule(WorkCalendarEventSaveDTO dto) {
		WorkCalendar workGroup = workGroupRepository.findById(dto.workCalendarId()).orElse(null);
		WorkCalendarEvent entity = null; 
		
		if (dto.id() != null) {
			entity = repository.findById(dto.id()).orElse(null);
		}
		
		if (entity == null) {
			entity = dto.newSchedule(workGroup);
		} else {
			dto.modifySchedule(entity);
		}
		
		repository.save(entity);
	}
	
	public void deleteSchedule(Long id) {		
		repository.deleteById(id);
	}
}
