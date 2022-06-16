package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
	private String detail1;

	public String getDetail1() {
		return detail1;
	}

	public void setDetail1(String detail1) {
		this.detail1 = detail1;
	}

	public AnnotationExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnotationExample [detail1=" + detail1 + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Program Start ::---");
	}
	@PreDestroy
	public void end() {
		System.out.println("----::End Program");
	}
	
}
