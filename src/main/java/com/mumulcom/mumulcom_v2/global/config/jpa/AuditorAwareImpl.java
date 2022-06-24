package com.mumulcom.mumulcom_v2.global.config.jpa;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @NonNull
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String modifiedBy;

        if (authentication instanceof AnonymousAuthenticationToken) {
            // 로그인을 하지 않은 경우
            modifiedBy = httpServletRequest.getRequestURI();
        } else {
            // 로그인을 한 경우
            modifiedBy = authentication.getName();
        }

        return Optional.of(modifiedBy);
    }

}
