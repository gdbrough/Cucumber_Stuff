package java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
 
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Hello output = (Hello) context
					.getBean("helloBean");
			System.out.println(output.getName());
        }
	}
}