package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/referencetype/refconfig.xml");
		First firobj=(First) ac.getBean("firref");
		System.out.println(firobj.getA());		
		System.out.println(firobj.getSec().getB());
	}

}
