package com.pack.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class JdbcSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BCryptPasswordEncoder encode;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select name , password , enabled from loginpage where name=?")
			.authoritiesByUsernameQuery("select name , role from loginpage where name=?")
			.passwordEncoder(encode);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http.authorizeRequests()
			.antMatchers("/balance").authenticated()
			.antMatchers("/hi").permitAll()
			.antMatchers("/welcome").permitAll()
			.antMatchers("/myloan").authenticated()
			.antMatchers("/contact").permitAll()
			.antMatchers("/hello").permitAll()
			.and()
			.formLogin()
			.and()
			.httpBasic();
	}
	
	@Bean(name = "encode")
	public BCryptPasswordEncoder passwordEncoder() {

	    return new BCryptPasswordEncoder();
	}
}
