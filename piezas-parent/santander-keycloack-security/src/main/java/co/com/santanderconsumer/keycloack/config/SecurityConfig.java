/**
 * 
 */
package co.com.santanderconsumer.keycloack.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.KeycloakSecurityComponents;
import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

/**
 * @author l.ruizs
 *
 */
@Configuration
@EnableWebSecurity
@ComponentScan(
	    basePackageClasses = KeycloakSecurityComponents.class,
	    excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.keycloak.adapters.springsecurity.management.HttpSessionManager"))
public class SecurityConfig extends KeycloakWebSecurityConfigurerAdapter{
	
	public static final String ROLE_UMA_AUTHORIZATION = "ROLE_uma_authorization";

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		SimpleAuthorityMapper grantedAuthorityMapper = new SimpleAuthorityMapper();
		
		KeycloakAuthenticationProvider keycloakAuthenticationProvider = keycloakAuthenticationProvider();
		keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(grantedAuthorityMapper);
		auth.authenticationProvider(keycloakAuthenticationProvider);
	}

	@Bean
	public KeycloakSpringBootConfigResolver KeycloakConfigResolver() {
		return new KeycloakSpringBootConfigResolver();
	}

	@Bean
	@Override
	protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
		return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/viability/v1/**").hasAnyAuthority(ROLE_UMA_AUTHORIZATION)
			.antMatchers("/accessdata/v1/**").hasAnyAuthority(ROLE_UMA_AUTHORIZATION)
			.and()
			.formLogin()
			.and()
			.anonymous().disable();
	}

}
