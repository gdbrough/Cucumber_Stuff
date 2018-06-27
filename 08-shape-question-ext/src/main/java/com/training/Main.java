package com.training;

import java.util.List;

import org.springframework.context.*;
import org.springframework.context.support.*;

import com.training.shapes.Shape;
import com.training.shapes.ShapeList;

@SuppressWarnings("unused")
public class Main {
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
//		for (int i = 1; i <= 4; i++) {
//			Shape shape = (Shape) context.getBean("shape" + i);
//			shape.printInfo();
//		}
//		for (int i = 1; i <= 2; i++) {
//			ShapeList shapes = (ShapeList) context.getBean("shapeList" + i);
//			shapes.printInfo();
//		}
		
		List<Shape> shapeList = (List<Shape>) context.getBean("testList");
		for(Shape shape : shapeList) {
			System.out.println(shape);
		}
	}
}