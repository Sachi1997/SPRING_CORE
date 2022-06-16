package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext aac=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student st1=aac.getBean("returnStudent",Student.class);
		System.out.println(st1.returnMsg());

	}

}
