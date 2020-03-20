package com.edu.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tri")
public class Triangle extends Shape {

	public Triangle(@Value("삼각형") String title, @Value("3") int width, @Value("5") int height) {
		super(title, width, height);
	}

	@Override
	public void viewSize() {
		System.out.println(getTitle() + "의 넓이 : " + (getWidth() * getHeight()) / 2);
	}

}
