package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
		Emp emp1=(Emp) con.getBean("Emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getEmpNo());
		System.out.println(emp1.getEmpAddress());
		System.out.println(emp1.getEmpCourses());
		System.out.println(emp1.getProps());
	}

}
