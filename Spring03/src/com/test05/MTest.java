package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Developer honggd = factory.getBean("honggd", Developer.class);
		Engineer leess = factory.getBean("leess", Engineer.class);
		
		System.out.println(honggd);
		System.out.println(leess);
	}
}
