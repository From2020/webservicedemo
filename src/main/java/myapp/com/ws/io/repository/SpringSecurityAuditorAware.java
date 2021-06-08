package myapp.com.ws.io.repository;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import myapp.com.ws.io.entity.Xusers;
import myapp.com.ws.ui.model.response.UserRest;

class SpringSecurityAuditorAware implements AuditorAware<String> {

	 public Optional<String> getCurrentAuditor() {

	  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

	  if (authentication == null || !authentication.isAuthenticated()) {
	   return null;
	  }

	  return Optional.of("Arafat");
	 }
	}
