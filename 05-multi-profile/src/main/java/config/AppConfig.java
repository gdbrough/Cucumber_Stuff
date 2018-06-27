package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages="config")
//@Import({ JndiInfrastructureConfig.class, StandaloneInfrastructureConfig.class })
@Import(StandaloneInfrastructureConfig.class)
public class AppConfig {
 
	@Autowired
	private InfrastructureConfig infrastructureConfig;
 
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(infrastructureConfig.dataSource());
	}
 
	@Bean
	public SomeNewService someNewService() {
		return new SomeNewServiceImpl(jdbcTemplate());
	}
 
}