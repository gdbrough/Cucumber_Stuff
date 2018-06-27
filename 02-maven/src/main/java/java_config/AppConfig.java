package java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan(basePackages = "java_config")
public class AppConfig {
 
    @Bean(name="helloBean")
    public Hello helloWorld() {
    	// 1. Could return a new instance.
    	//return new HelloImpl();

    	// 2.  Could return an instance in a particular state.
    	HelloImpl helloImpl = new HelloImpl();
    	helloImpl.setName("Greg");
        return helloImpl;
    }
}