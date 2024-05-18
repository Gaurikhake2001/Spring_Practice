package com.springcore.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Student getStudent()
	{
		return new Student();
	}
	
	@Bean
	public Lab getLab()
	{
		return new Lab();
	}

}
