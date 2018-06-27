package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
 
@Configuration
@ComponentScan(basePackages = "config")
@Import(ServicesConfig.class)
public class AppConfig {
	
	@Autowired
	private ServicesConfig servicesConfig;
 
	// Bean context lookup name will default to method name.
    @Bean
    public MainService mainService() {
        return new MainServiceImpl(servicesConfig.databaseService());
    }
 
}