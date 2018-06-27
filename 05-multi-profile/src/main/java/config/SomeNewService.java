package config;

import org.springframework.jdbc.core.JdbcTemplate;

public interface SomeNewService {

	JdbcTemplate getJdbcTemplate();
}