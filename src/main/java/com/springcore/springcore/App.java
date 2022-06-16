package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Lawyer lawyer1= (Lawyer) context.getBean("Lawyer1");
       System.out.println(lawyer1);
       
    }
}
