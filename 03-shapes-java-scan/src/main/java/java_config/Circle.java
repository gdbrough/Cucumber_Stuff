package java_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:app.properties")
public class Circle implements Shape {

	@Value("${radius}") private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (radius * radius) * 3.14;
	}
	
}
