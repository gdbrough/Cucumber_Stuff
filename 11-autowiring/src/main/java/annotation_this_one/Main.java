package annotation_this_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation_this_one.Shop;

public class Main {

	public static void main(String[] args) {
		
		// With-resources ensures resources are closed at the end of the statement.
		/*
		 * Comment out code within this block, put a syso("auto") in the Person set() and you can see the autowire annotation working.
		 */
		try (ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/annotation_this_one/applicationContext2.xml")) {
			Shop shop = (Shop) context.getBean("shop");
			System.out.println(shop);
		}
	}
}
