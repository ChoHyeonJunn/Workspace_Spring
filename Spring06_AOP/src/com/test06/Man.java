package com.test06;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person {

	@Override
	public void classWork() {
		System.out.println("컴퓨터를 켜서 게임한다."); // cc (core concern) 특징적인 부분
	}

}
