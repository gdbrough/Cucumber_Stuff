package annotations;

import org.springframework.context.support.*;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml")) {

			Builder builder = (Builder) context.getBean("builderBean"); 
			Electrician electrician = (Electrician) context.getBean("electricianBean"); 
			Plumber plumber = (Plumber) context.getBean("plumberBean"); 

			System.out.println(electrician.getCost()+builder.getCost()+plumber.getCost());
		}
	}
}
