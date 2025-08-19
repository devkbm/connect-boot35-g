package com.like.system.webresource.application.service;

import org.springframework.stereotype.Service;

import com.like.system.webresource.application.port.in.delete.WebResourceDeleteUseCase;
import com.like.system.webresource.application.port.out.WebResourceCommandDbPort;

@Service
public class WebResourceDeleteService implements WebResourceDeleteUseCase {

	WebResourceCommandDbPort port;
	
	WebResourceDeleteService(WebResourceCommandDbPort port) {
		this.port = port;
	}
	
	@Override
	public void delete(String webResourceId) {
		this.port.delete(webResourceId);		
	}
	
}
