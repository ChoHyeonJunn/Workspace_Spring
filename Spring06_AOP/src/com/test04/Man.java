package com.test04;

public class Man implements Person {

	@Override
	public String classWork() {
		String s = null;
		s.length();
		
		System.out.println("컴퓨터를 켜서 게임한다."); // cc (core concern) 특징적인 부분
		return "롤";
	}

}
