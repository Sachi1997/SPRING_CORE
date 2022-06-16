package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  String returnMsg() {
		return "Student Details Will Come Soon...";
		
	}
	
}
