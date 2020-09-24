/**
 * 
 */
package co.com.santander.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.santander.springsecurity.Service.GenerateTokenService;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

/**
 * @author l.ruizs
 *
 */
@Slf4j
@Component
public class FeignRequestInterceptor implements RequestInterceptor {
	private static final String AUTHORIZATION_HEADER = "Authorization";
	private static final String BEARER_TOKEN_TYPE = "Bearer";
	private static final String USER_TOKEN = "feign";
	
	@Autowired
	GenerateTokenService generateTokenService;
	
	@Override
	public void apply(RequestTemplate template) {
		log.info("[FeignRequestInterceptor] start interceptor");
		if(template.headers().containsKey(AUTHORIZATION_HEADER))
			log.warn("The autorization token has been already set");
		else {
			log.info("[FeignRequestInterceptor] Constructing Header {} for Token {}", AUTHORIZATION_HEADER, BEARER_TOKEN_TYPE);
			String token = generateTokenService.getJWTToken(USER_TOKEN);
			template.header(AUTHORIZATION_HEADER, String.format("%s %s", BEARER_TOKEN_TYPE,token));
		}
		
		
	}

}
