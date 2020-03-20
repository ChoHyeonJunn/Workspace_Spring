package com.test03;

import org.springframework.stereotype.Component;

@Component("samsong")
public class SamsongTV implements TV {

	public SamsongTV() {
		System.out.println("SamsongTV 생성!!");
	}
	
	@Override
	public void powerOn() {
		System.out.println("samsongTV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("samsongTV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("samsongTV volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("samsongTV volume down");
	}

}
