package com.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class)) {

			Plumber plumber = (Plumber) context.getBean("plumber");
			System.out.println(plumber);
		}
	}
}