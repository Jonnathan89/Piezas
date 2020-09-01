package co.com.santander.piezas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.com.santander"})
@EnableAutoConfiguration
public class ServicesBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesBackApplication.class, args);
	}

}
