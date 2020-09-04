package co.com.santander.configurations;

import org.slf4j.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.XSlf4j;

@Configuration
@XSlf4j
@EnableFeignClients(basePackages = "co.com.santander.client")
public class FeignConfiguration {	
	public FeignConfiguration(){
		log.entry(FeignConfiguration.class.getName());
	}
}
