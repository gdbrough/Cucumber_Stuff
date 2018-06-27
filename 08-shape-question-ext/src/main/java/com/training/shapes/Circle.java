package com.training.shapes;

/**
 * A concrete version of Shape. If the code that uses this needs only the area
 * or methods that are inherited from Object, it should declare the type as
 * Shape.
 */

public class Circle extends Shape {
	private double radius = 1.0;

	public Circle() {
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return (radius);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (Math.PI * radius * radius);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
