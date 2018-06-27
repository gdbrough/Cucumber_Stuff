package com.training.plumber.annot;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/training/plumber/annot/applicationContext.xml");

		Plumber plumber = (Plumber) context.getBean("handyman");
		System.out.println(plumber);
	}
}