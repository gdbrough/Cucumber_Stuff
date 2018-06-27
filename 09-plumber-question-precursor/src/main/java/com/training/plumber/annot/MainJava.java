package com.training.plumber.annot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJava {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			Plumber plumber = (Plumber) context.getBean("handyman");
			System.out.println(plumber);
		}

	}
}