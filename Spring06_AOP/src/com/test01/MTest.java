package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test02.Person;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");

		Person w = factory.getBean("woman", Person.class);
		Person m = factory.getBean("man", Person.class);

		System.out.println("---여학생 입장.");
		w.classWork(); // target

		System.out.println("---------");

		System.out.println("---남학생 입장.");
		m.classWork(); // target
	}
}
