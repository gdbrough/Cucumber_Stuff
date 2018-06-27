package config;

import org.springframework.jdbc.core.JdbcTemplate;

public class SomeNewServiceImpl implements SomeNewService {

	private JdbcTemplate jdbcTemplate;
	
	public SomeNewServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

}