package com.like.login.adapter.in.web;

import java.util.Date;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SessionTestController {		
			
	@GetMapping("/api/system/user/session")
	public String getSession(HttpSession session) {
		/*
		session.getAttributeNames().asIterator()
         		  .forEachRemaining(name -> log.info("session name={}, value={}",name, session.getAttribute(name) ));
		*/
		
		log.info("sessionId={}", session.getId());
		log.info("maxInactiveInterval={}", session.getMaxInactiveInterval());
		log.info("creationTime={}", new Date(session.getCreationTime()));
		log.info("lastAccessTjme={}",new Date(session.getLastAccessedTime()));
		log.info("isNew={}", session.isNew());
		
		String rtn = """
				sessionId=%s 
				maxInactiveInterval=%d
				creationTime=%s
				lastAccessTjme=%s
				isNew=%s
				""".formatted(session.getId()
							 ,session.getMaxInactiveInterval()
							 ,new Date(session.getCreationTime())
							 ,new Date(session.getLastAccessedTime())
							 ,session.isNew()); 
		return rtn;
	}
}
