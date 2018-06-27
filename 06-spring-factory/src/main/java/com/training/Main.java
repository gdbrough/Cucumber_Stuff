package com.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/applicationContext.xml")) {

			// Get client service from static factory.
			ClientService cliService = (ClientService) context
					.getBean("clientService");
			cliService.printSomething();
			
			// Get account service using factory method alternative.
			AccountService accService = (AccountService) context.getBean("accountService");
			accService.printSomething();
		}
	}
}
