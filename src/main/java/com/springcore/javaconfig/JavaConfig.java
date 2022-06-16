package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa  returnSamosa() {
		return new Samosa();
	}
	
	@Bean
	public  Student returnStudent() {
		Student student=new Student(returnSamosa());
		return student;
		
	}
}
