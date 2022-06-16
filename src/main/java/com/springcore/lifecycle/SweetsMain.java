package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SweetsMain {

	public static void main(String[] args) {
		AbstractApplicationContext aac=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		/*
		 * Sweets swt= (Sweets) aac.getBean("sweet1");
		 * System.out.println(swt.getSweetName());
		 */
		aac.registerShutdownHook();//Registering shutdown hook
		
		AnnotationExample ae=(AnnotationExample) aac.getBean("exmple1");
		System.out.println(ae);

	}

}
