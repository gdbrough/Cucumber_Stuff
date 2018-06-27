package com.training.shapes;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
	private double length, width;

	public Rectangle() {
		setLength(20);
		setWidth(10);
	}

	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}

	public double getLength() {
		return (length);
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return (width);
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return (length * width);
	}
}
