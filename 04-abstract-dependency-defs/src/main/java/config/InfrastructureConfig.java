package config;

import javax.sql.DataSource;

import org.springframework.transaction.PlatformTransactionManager;

public interface InfrastructureConfig {
	
		public DataSource dataSource();

		public PlatformTransactionManager transactionManager();
		
}