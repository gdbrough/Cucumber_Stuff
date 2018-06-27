package java_config_ext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
 
        try(AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfigWithProperty.class)) {
			Hello output = (Hello) context
					.getBean("helloBean");
			System.out.println(output.getName());
			
			AnotherHello anotherHello = (AnotherHello) context.getBean("anotherHelloBean");
			System.out.println("Name: " + anotherHello.getName() + ", desc: " + anotherHello.getDetail().getDescription());
        }
	}
}