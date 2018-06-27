package type;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import type.Person;

public class Main {

	public static void main(String[] args) {
		
		// With-resources ensures resources are closed at the end of the statement.
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/type/applicationContext.xml")) {
			Person person = (Person) context.getBean("person");
			System.out.println(person);
		}
			
	}
}
