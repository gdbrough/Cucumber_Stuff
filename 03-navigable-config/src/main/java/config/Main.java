package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
 
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
        	MainService mainService = (MainService) context
					.getBean("mainService");
        	String details = mainService.getDetails();
        	System.out.println(details);
        }
	}
}