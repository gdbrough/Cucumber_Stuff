package java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigWithProperties.class)) {
		
			Shape circle = (Shape) context.getBean("circle");
			System.out.println("Area of a circle with Radius of 10 = " + circle.getArea());
			
			Shape rectangle = (Shape) context.getBean("rectangle");
			System.out.println("Area of a rectangle with width of 10 and height of 10 = " + rectangle.getArea());
		}
		
	}

}
