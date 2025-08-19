package com.like.core.security.oauth2;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class OAuth2AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	
	// "https://connect-one.zapto.org/oauth2/"
	@Value("${client.oauth2.redirect-url}")
	String CLIENT_URL;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {					
				
		OAuth2LoginRequestThreadLocal.remove();
					
		getRedirectStrategy().sendRedirect(request, response, this.CLIENT_URL + request.getSession().getId());
	
	}

}
