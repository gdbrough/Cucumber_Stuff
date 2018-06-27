package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConfig {
 
	@Autowired
	private InfrastructureConfig infrastructureConfig;
 
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(infrastructureConfig.dataSource());
	}
 
	@Bean
	public SomeNewService someService() {
		return new SomeNewServiceImpl(jdbcTemplate());
	}
 
}