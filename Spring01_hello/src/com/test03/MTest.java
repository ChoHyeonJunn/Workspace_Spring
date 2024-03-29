package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {

		// 옛날 방식
		// 1.
		// Resource res = new FileSystemResource("src/com/test03/beans.xml");

		// 2.
		// Resource res = new ClassPathResource("com/test03/beans.xml");
		// BeanFactory factory = new XmlBeanFactory(res);

		// 3.
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");

		MessageBean bean = (MessageBean) factory.getBean("korean");
		bean.sayHello("스프링");

		bean = (MessageBean) factory.getBean("english");
		bean.sayHello("spring");

	}
}


/*
1. ApplicationContext 와 ClassPathXmlApplicationContext
BeanFactory <- Application <- ClassPathXmlApplicationContext

스프링의 ApplicationContext 객체는 스프링 컨테이너의 인스턴스 이다.

스프링은 ApplicationContext의 몇가지 기본 구현을 제공한다.

그 중 ClassPathXmlApplicationContext는 XML 형식의 독립형 어플리케이션에 적합하다. (지정된 classpath에서 xml 파일을 읽어서 객체 생성)


2. content, context, container

content : 기능, 내용, ... (실제 기능)
context : 기능을 구현하기 위한 정보, 설정, ... (설정파일)
container : 담는 그릇 (설정 파일을 담고 있는 그릇 servlet에서는 tomcat 이 container 였다!!)

*/

