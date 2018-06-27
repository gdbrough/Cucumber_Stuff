package config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Profile("standalone")
@Configuration
public class StandaloneInfrastructureConfig implements InfrastructureConfig {

	@Override
	@Bean
	public DataSource dataSource() {
		System.out.println("Creating standalone datasource.");
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("testURL");
		dataSource.setUsername("testUsername");
		dataSource.setPassword("testPassword");
		return dataSource;
	}

	@Override
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

}
