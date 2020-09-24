package co.com.santander.configurations;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import lombok.extern.slf4j.XSlf4j;

@Configuration
@XSlf4j
@EnableFeignClients(basePackages = "co.com.santander.client")
public class FeignConfiguration {	
	public FeignConfiguration(){
		log.entry(FeignConfiguration.class.getName());
	}
	
	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
