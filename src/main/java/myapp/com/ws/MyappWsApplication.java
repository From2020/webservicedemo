package myapp.com.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import myapp.com.ws.security.AppPrpoerties;
import myapp.com.ws.security.SpringSecurityAuditorAware;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableJpaAuditing
public class MyappWsApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyappWsApplication.class);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(MyappWsApplication.class, args);
	}
	
    @Bean
    public AuditorAware<String> auditorAware() {
        return new SpringSecurityAuditorAware();
    }
	
//	@Bean
//	public BCryptPasswordEncoder bCryptPasswordEncoder () {
//		return new BCryptPasswordEncoder();
//	}
	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	 return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

	
	@Bean
	public SpringApplicationContext applicationContext() {
		return new SpringApplicationContext();
	}
	
	@Bean(name="AppProperties")
	public AppPrpoerties appProperties() {
		return new AppPrpoerties();
	}

}
