package com.pack.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
//		http.authorizeRequests().anyRequest().authenticated();
//		http.httpBasic();
//		http.formLogin();
		
		http.authorizeRequests()
			.antMatchers("/balance").authenticated()
			.antMatchers("/myloan").authenticated()
			.antMatchers("/hi").permitAll()
			.antMatchers("/hello").permitAll()
			.antMatchers("/welcome").permitAll()
			.and()
			.httpBasic()
			.and()
			.formLogin();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication()
			.withUser("babu").password("babu1523").authorities("manager")
			.and()
			.withUser("bhavani").password("bhavani1523").authorities("admin")
			.and()
			.withUser("eswar").password("eswar1523").authorities("read")
			.and()
			.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
}
