package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
		EmpAddress addr=con.getBean("empaddr1",EmpAddress.class);
		System.out.println(addr);

	}

}
