package com.test06;

import com.test07.IgTV;
import com.test07.SamsongTV;

public class BeanFactory {
	Object getBean(String beanName) {

		if (beanName.equals("samsong")) {
			return new SamsongTV();
		} else if (beanName.equals("ig")) {
			return new IgTV();
		}

		return null;
	}
}

/*
Spring Container 의 디자인패턴 중 하나인 Factory 패턴의 예 이다.

Spring FrameWork 안에는 이 외에도 Strategy 패턴, Singleton 패턴 등 많은 디자인 패턴이 적용되어 있다.
*/