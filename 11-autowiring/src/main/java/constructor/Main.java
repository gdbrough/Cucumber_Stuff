package constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructor.Developer;

public class Main {

	public static void main(String[] args) {
		
		// With-resources ensures resources are closed at the end of the statement.
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/constructor/applicationContext.xml")) {
			Developer developer = (Developer) context.getBean("developer");
			System.out.println(developer);
		}
	}
}
