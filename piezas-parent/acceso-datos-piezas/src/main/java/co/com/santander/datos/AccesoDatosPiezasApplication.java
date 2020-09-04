package co.com.santander.datos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.com.santander", "co.com.santander.datos.client.SecurityToken"})
@EnableAutoConfiguration
public class AccesoDatosPiezasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccesoDatosPiezasApplication.class, args);
	}

	
}
