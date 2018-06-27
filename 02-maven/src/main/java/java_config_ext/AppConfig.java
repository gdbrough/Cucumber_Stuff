package java_config_ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan(basePackages = "java_config_ext")
public class AppConfig {
 
    @Bean(name="helloBean")
    public Hello hello() {
    	// 1. Could return a new instance.
    	//return new HelloImpl();

    	// 2.  Could return an instance in a particular state.
    	HelloImpl helloImpl = new HelloImpl();
    	helloImpl.setName("Greg");
        return helloImpl;
    }
    
    @Bean(name="anotherHelloBean")
    public AnotherHello anotherHello() {
    	Detail detail = new Detail();
    	detail.setDescription("Sunny");
    	return new AnotherHello("Terry", detail);
    }
}