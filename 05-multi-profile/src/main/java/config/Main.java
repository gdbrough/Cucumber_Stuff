package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
 
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
        	context.getEnvironment().setActiveProfiles("remote");
        	context.scan("config"); 
        	context.refresh();
        	SomeNewService service = (SomeNewService) context
					.getBean("someNewService");
        	String details = service.getJdbcTemplate().toString();
        	System.out.println(details);
        }
	}
}