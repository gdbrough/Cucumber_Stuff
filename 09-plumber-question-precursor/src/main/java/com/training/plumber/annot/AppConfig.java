package com.training.plumber.annot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean(name="handyman")
	public Plumber plumber() {
		return new Plumber("Mario");
	}
}
