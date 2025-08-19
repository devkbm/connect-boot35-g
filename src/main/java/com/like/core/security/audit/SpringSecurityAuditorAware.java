package com.like.core.security.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.like.core.jpa.domain.AuditorDetails;
import com.like.core.web.util.WebRequestUtil;

import jakarta.servlet.http.HttpServletRequest;

public class SpringSecurityAuditorAware implements AuditorAware<AuditorDetails> {
    
    @Override
    public Optional<AuditorDetails> getCurrentAuditor() {
        ServletRequestAttributes sra = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = sra.getRequest();
        AuditorDetails currentAuditor = null;
        
        if(request != null) {
            String hostIp = WebRequestUtil.getIpAddress(request);            
            currentAuditor = new AuditorDetails(this.getUserId(), hostIp);
            return Optional.of(currentAuditor);
        }

        return Optional.of(currentAuditor);
    }
    
    private String getUserId() {
    	return SecurityContextHolder.getContext().getAuthentication().getName();
    }
    
}
