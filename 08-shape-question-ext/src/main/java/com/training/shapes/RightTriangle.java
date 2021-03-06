package com.training.shapes;

/**
 * A concrete version of Shape. If the code that uses this needs only the area
 * or methods that are inherited from Object, it should declare the type as
 * Shape.
 */

public class RightTriangle extends Shape {
	private double sideA, sideB;

	public RightTriangle() {
	}

	public RightTriangle(double sideA, double sideB) {
		setSideA(sideA);
		setSideB(sideB);
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getHypotenuse() {
		return (Math.sqrt(sideA * sideA + sideB * sideB));
	}

	public double getArea() {
		return (0.5 * sideA * sideB);
	}

	@Override
	public String toString() {
		return "RightTriangle [sideA=" + sideA + ", sideB=" + sideB + "]";
	}
}