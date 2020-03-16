package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp choi = factory.getBean("choi", Emp.class);
		Emp back = factory.getBean("back", Emp.class);
		
		System.out.println(choi);
		System.out.println(back);
	}
}
