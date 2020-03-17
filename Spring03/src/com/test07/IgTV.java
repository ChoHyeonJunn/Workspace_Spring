package com.test07;

public class IgTV implements TV {

	public IgTV() {
		System.out.println("IgTV 생성!!");
	}
	
	@Override
	public void powerOn() {
		System.out.println("igTV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("igTV power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("igTV volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("igTV volume down");
	}

}
