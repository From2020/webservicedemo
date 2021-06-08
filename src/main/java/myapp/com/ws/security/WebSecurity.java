package myapp.com.ws.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import myapp.com.ws.service.UserService;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	private final UserService userDetailsService;
	

	public WebSecurity(UserService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Override
	protected void configure(HttpSecurity httpSecurityp) throws Exception {

		httpSecurityp.csrf().disable().authorizeRequests()
		        .antMatchers(HttpMethod.POST, "/users").permitAll()
				.anyRequest().authenticated().and().addFilter(getAutheticationFilter())
				.addFilter(new AuthorizationFilter(authenticationManager()))
				.sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	PasswordEncoder encoder =
		     PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication()
	    //.withUser("user")
	    //.password("{noop}password")
	    //.roles("USER");

		auth.userDetailsService(userDetailsService);
	}

	public AuthenticationFilter getAutheticationFilter() throws Exception {
		final AuthenticationFilter filter = new AuthenticationFilter(authenticationManager());
		filter.setFilterProcessesUrl("/users/login");
		return filter;
	}

}
