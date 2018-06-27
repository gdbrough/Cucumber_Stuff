package config;

import org.springframework.jdbc.core.JdbcTemplate;

public class SomeNewServiceImpl implements SomeNewService {

	@SuppressWarnings("unused")
	private JdbcTemplate jdbcTemplate;
	
	public SomeNewServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}