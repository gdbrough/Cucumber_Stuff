package java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
 
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
    	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
    	    obj.printHelloWorld("Using Java Config");
        }
	}
}