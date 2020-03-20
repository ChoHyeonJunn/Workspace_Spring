package com.test02;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
 * MessageSourceAware 는 번들이 지정된 properties 파일을 setMessageSource로 전달한다. -> 메세지 국제화를 위해 사용
 * 
 * ResourceBundleMessageSource와 MessageSourceAware 는 쌍으로 사용한다.
 * ResourceBundleMEssageSource의 setBaseName()을 통해 전달받은 파일을
 * setMessageSource()를 자동 호출해서 매핑하는 역할을 한다.
 */
public class MTest {

	/*
	 * 언어설정 변경 코드
	 */
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");

		MemberInfo member = factory.getBean("member", MemberInfo.class);

		int num = (int) (Math.random() * 2);
		if (num == 0) {
			String msg = factory.getMessage("title", null, "기본 메세지", Locale.getDefault());
			System.out.println(msg);
			member.display(Locale.getDefault());
		} else {
			String msg = factory.getMessage("titl", null, "default message", Locale.ENGLISH);
			System.out.println(msg);
			member.display(Locale.ENGLISH);
		}
	}
}
