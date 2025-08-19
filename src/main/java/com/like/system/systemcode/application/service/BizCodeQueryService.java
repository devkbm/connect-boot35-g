package com.like.system.systemcode.application.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.like.system.systemcode.adapter.out.db.data.BizCodeQueryRepository;
import com.like.system.systemcode.adapter.out.db.entity.JpaBizCode;

@Service
@Transactional(readOnly = true)
public class BizCodeQueryService {

	private BizCodeQueryRepository repository;
	
	public BizCodeQueryService(BizCodeQueryRepository repository) {
		this.repository = repository;
	}
	
	public List<JpaBizCode> getBizCodeAllList(String companyCode, String typeId) {
		return this.repository.getBizCodeList(companyCode, typeId);
	}
}
