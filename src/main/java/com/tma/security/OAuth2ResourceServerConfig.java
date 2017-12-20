package com.tma.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

	private static final String RESOURCE_ID = "SPRING_REST_API";

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID).stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.anonymous().disable().requestMatchers().antMatchers("/product/**").and().authorizeRequests()
				.antMatchers("/product/**").access("hasRole('ROLE_ADMIN')").and().exceptionHandling()
				.accessDeniedHandler(new OAuth2AccessDeniedHandler());

		http.anonymous().disable().requestMatchers().antMatchers("/location/**").and().authorizeRequests()
				.antMatchers("/location/**").access("hasRole('ROLE_ADMIN')").and().exceptionHandling()
				.accessDeniedHandler(new OAuth2AccessDeniedHandler());

		http.anonymous().disable().requestMatchers().antMatchers("/time/**").and().authorizeRequests()
				.antMatchers("/time/**").access("hasRole('ROLE_ADMIN')").and().exceptionHandling()
				.accessDeniedHandler(new OAuth2AccessDeniedHandler());

		http.anonymous().disable().requestMatchers().antMatchers("/sale/**").and().authorizeRequests()
				.antMatchers("/sale/**").access("hasRole('ROLE_ADMIN')").and().exceptionHandling()
				.accessDeniedHandler(new OAuth2AccessDeniedHandler());

	}

}