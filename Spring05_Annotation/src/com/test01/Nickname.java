package com.test01;

import org.springframework.stereotype.Component;

@Component
public class Nickname {
// <bean id="nickname" class="com.test01.Nickname"/> 와 같은 의미이다 

	@Override
	public String toString() {
		return "carmel";
	}

}
