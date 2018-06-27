package config;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;

@Profile("remote")
@Configuration
public class JndiInfrastructureConfig implements InfrastructureConfig {

	@Override
	@Bean
	public DataSource dataSource() {
		System.out.println("Creating remote datasource.");
		return new DataSource() {
			
			@Override
			public <T> T unwrap(Class<T> iface) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void setLoginTimeout(int seconds) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLogWriter(PrintWriter out) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Logger getParentLogger() throws SQLFeatureNotSupportedException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getLoginTimeout() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public PrintWriter getLogWriter() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Connection getConnection(String username, String password)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Connection getConnection() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	@Override
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new PlatformTransactionManager() {
			
			@Override
			public void rollback(TransactionStatus arg0) throws TransactionException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public TransactionStatus getTransaction(TransactionDefinition arg0)
					throws TransactionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void commit(TransactionStatus arg0) throws TransactionException {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
