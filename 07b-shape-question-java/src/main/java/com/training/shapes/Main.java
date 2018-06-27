package com.training.shapes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Shape shape1 = (Shape) context.getBean("circle");
		printInfo(shape1);
		Shape shape2 = (Shape) context.getBean("rectangle");
		printInfo(shape2);
		context.close();
	}

	private static void printInfo(Shape shape) {
		System.out.printf("%s with area of %,.2f%n", shape.getClass()
				.getSimpleName(), shape.getArea());
	}
}