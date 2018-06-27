package annotation_this_one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean(name="shop")
	public Shop shop() {
		return new Shop();
	}
}
