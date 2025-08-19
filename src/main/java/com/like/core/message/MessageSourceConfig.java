package com.like.core.message;


import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class MessageSourceConfig {

	@Bean
	LocaleResolver localResolver() {
		//세션 기준
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		
		//쿠키 기준
		//CookieLocaleResolver localeResolver = new CookieLocaleResolver();
	
		localeResolver.setDefaultLocale(Locale.KOREA);
		return localeResolver;
	}
	
	@Bean
	ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/message/messages");		
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(3600);
		
		return messageSource;
	}
}
