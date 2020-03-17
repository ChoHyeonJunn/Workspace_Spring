package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		
		//TV samsong = factory.getBean("samsong", TV.class);
		TV ig = factory.getBean("ig", TV.class);
		
//		samsong.powerOn();
//		samsong.volumeUp();
//		samsong.volumeDown();
//		samsong.powerOff();
		
		ig.powerOn();
		ig.volumeUp();
		ig.volumeDown();
		ig.powerOff();
	}
}
