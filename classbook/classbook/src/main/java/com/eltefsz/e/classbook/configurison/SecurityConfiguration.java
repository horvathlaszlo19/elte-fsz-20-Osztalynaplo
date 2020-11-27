package com.eltefsz.e.classbook.configurison;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
    	.authorizeRequests()
    	 	.antMatchers("/css/**").permitAll()        	
    	 	.antMatchers("/h2/**").permitAll()
    	 	.antMatchers("/teacher/**").hasRole("TEACHER")
//    	 	.antMatchers("/add-hotel/**").hasRole("ADMIN")
    	 	.anyRequest().authenticated()        	 
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
			

}
