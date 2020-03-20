package com.test02;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MemberInfo implements MessageSourceAware {

	private MessageSource messageSource;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("컨테이너가 메시지 설정을 수행중 ...");
		this.messageSource = messageSource;
		
	}
	
	public void display(Locale locale) {
		String name = messageSource.getMessage("member.name", null, locale);
		String birthplace = messageSource.getMessage("member.birthplace", null, locale);
		String hobby = messageSource.getMessage("member.hobby", null, locale);
		String age = messageSource.getMessage("member.age", new Object[] {"15"}, locale);
		
		System.out.println(locale);
		System.out.println(name);
		System.out.println(birthplace);
		System.out.println(hobby);
		System.out.println(age);
	}

}
