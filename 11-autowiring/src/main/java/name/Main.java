package name;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import name.Customer;

public class Main {

	public static void main(String[] args) {
	
		// With-resources ensures resources are closed at the end of the statement.
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/name/applicationContext.xml")) {
			  Customer cust = (Customer) context.getBean("customer");
			  System.out.println(cust);
		}
			
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/name/applicationContext.xml");

		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
		*/
	}
}
