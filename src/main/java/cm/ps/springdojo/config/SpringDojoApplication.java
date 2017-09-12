package cm.ps.springdojo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:applicationContext.xml")
public class SpringDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDojoApplication.class, args);
	}
}