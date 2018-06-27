package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public Plumber plumber() {
		return new Plumber("Mario");
	}
}
