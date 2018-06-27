package java_config_ext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan(basePackages = "java_config_ext")
public class AppConfigInterdependency {
 
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
    	// Just call local method rather than bean instantiation etc.
    	return new AnotherHello("Larry", detail());
    }
    
    @Bean(name="detailBean")
    public Detail detail() {
    	Detail detail = new Detail();
    	detail.setDescription("Sunny");
    	return detail;
    }
}