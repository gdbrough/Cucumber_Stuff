package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			// ToolStore store = (ToolStore) context.getBean("store");

			BuildHelper builder = (BuildHelper) context.getBean("handyman");
			System.out.println(builder.getPlumber() + " has extra tool: "
					+ builder.getTool());
		}
	}
}