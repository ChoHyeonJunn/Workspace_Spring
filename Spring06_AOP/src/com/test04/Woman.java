package com.test04;

public class Woman implements Person {

	@Override
	public String classWork() {
		System.out.println("컴퓨터 켜서 쇼핑한다.");	// cc (core concern) 특징적인 부분
		return "신발";
	}

}
