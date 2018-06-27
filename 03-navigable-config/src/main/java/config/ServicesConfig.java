package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan(basePackages = "config")
public class ServicesConfig {
 
    @Bean
    public DatabaseService databaseService() {
        return new DatabaseServiceImpl();
    }
 
}