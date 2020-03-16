package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");

		Address lee = factory.getBean("lee", Address.class);
		System.out.println(lee);

		Address hong = factory.getBean("hong", Address.class);
		System.out.println(hong);

		((ClassPathXmlApplicationContext) factory).close();	// close는 원래 객체 형태로 형변환 하여 가능하다.
	}
}
