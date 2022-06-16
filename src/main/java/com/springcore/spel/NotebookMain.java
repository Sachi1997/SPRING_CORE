package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.beans.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class NotebookMain { 

	public static void main(String[] args) throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Notebook nb=ac.getBean("notebook",Notebook.class);
		System.out.println(nb);
		
		SpelExpressionParser spelp=new SpelExpressionParser();
		org.springframework.expression.Expression exp=	spelp.parseExpression("33+45");
		System.out.println(exp.getValue());

	}

}
