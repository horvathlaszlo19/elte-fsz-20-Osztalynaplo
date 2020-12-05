package com.eltefsz.e.classbook.configurison;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.eltefsz.e.classbook.security.authSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
    	.authorizeRequests()
    	 	.antMatchers("/css/**").permitAll()        	
    	 	.antMatchers("/h2/**").permitAll()
    	 	.antMatchers("/teacher/**").access("hasRole('TEACHER')")
    	 	.antMatchers("/student/**").hasRole("STUDENT")
    	 	.anyRequest().authenticated()
    	.and().formLogin().successHandler(authSuccessHandler())
    	.and()
    	 	.csrf().ignoringAntMatchers("/h2/**")
	 	.and()
    		.headers().frameOptions().sameOrigin() // h2-console access
    		.and()
            .formLogin()
    	        	.loginPage("/login").permitAll()
    	        .and()
    		        .logout().permitAll();

}
	

	@Bean
	public AuthenticationSuccessHandler authSuccessHandler(){
	    return new authSuccessHandler();
	}
	
	//PASSWORD ENCODER:
	//@Bean
	//public PasswordEncoder passwordEncode() {
	//	return new BCryptPasswordEncoder();
	//}

}
