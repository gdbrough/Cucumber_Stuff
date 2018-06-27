package annotation_this_one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJava {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			Shop shop = (Shop) context.getBean("shop");
			System.out.println(shop);
		}
	}
}
