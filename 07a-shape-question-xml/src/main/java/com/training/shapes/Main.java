package com.training.shapes;

import org.springframework.context.*;
import org.springframework.context.support.*;

/**
 * Driver class. The only class that should import Spring packages or depend on
 * Spring in any way.
 */

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/applicationContext.xml");
		Shape shape1 = (Shape) context.getBean("shape1");
		printInfo(shape1);
		Shape shape2 = (Shape) context.getBean("shape2");
		printInfo(shape2);
	}

	private static void printInfo(Shape shape) {
		System.out.printf("%s with area of %,.2f%n", shape.getClass()
				.getSimpleName(), shape.getArea());
	}
}