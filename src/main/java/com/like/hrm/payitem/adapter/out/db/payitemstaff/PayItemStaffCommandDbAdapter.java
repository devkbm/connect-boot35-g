package com.like.hrm.payitem.adapter.out.db.payitemstaff;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.like.hrm.payitem.adapter.out.db.payitemstaff.data.PayItemStaffJpaRepository;
import com.like.hrm.payitem.application.port.out.PayItemStaffCommandDbPort;
import com.like.hrm.payitem.domain.PayItemStaff;

@Repository
public class PayItemStaffCommandDbAdapter implements PayItemStaffCommandDbPort {

	PayItemStaffJpaRepository repository;
	
	PayItemStaffCommandDbAdapter(PayItemStaffJpaRepository repository) {
		this.repository = repository;				
	}
	
	@Override
	public boolean checkDuplication(PayItemStaff entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<PayItemStaff> select(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void save(PayItemStaff entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
