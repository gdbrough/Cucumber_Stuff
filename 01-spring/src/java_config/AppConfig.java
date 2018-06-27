package java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
// Java config requires cglib.jar
@Configuration
public class AppConfig {
 
    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
 
}