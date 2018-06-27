package xml_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/applicationContext.xml")) {

			Hello output = (Hello) context
					.getBean("helloBean");
			System.out.println(output.getName());
			
			AnotherHello anotherHello = (AnotherHello) context.getBean("anotherHelloBean");
			System.out.println("Name: " + anotherHello.getName() + ", desc: " + anotherHello.getDetail().getDescription());
		}
	}
}
