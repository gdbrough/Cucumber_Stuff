package com.training.plumber;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/training/plumber/applicationContext.xml");

		Plumber plumber = (Plumber) context.getBean("handyman");
		System.out.println(plumber);
	}
}