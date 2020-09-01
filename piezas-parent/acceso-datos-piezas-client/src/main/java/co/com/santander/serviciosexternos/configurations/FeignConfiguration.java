package co.com.santander.serviciosexternos.configurations;

import org.slf4j.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.XSlf4j;

@Configuration
@XSlf4j
@EnableFeignClients(basePackages = "co.com.santander.serviciosexternos.client")
public class FeignConfiguration {	
	
	
	public FeignConfiguration(){
		
	}
}
