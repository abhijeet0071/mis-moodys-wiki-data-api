package com.mismoodyswikidataapi.config;
//
//import com.okta.spring.boot.oauth.Okta;
//import org.springframework.boot.actuate.autoconfigure.security.reactive.EndpointRequest;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
@Configuration
public class SecurityConfig {
//
//	@Bean
//	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//
//		Okta.configureResourceServer401ResponseBody(http);
//		return http
//				.authorizeExchange(exchanges -> exchanges.matchers(EndpointRequest.toAnyEndpoint())
//						.permitAll()
//						.pathMatchers(HttpMethod.GET, "/docs/**","/swagger-ui.html", "/swagger-ui/**", "/webjars/**", "/v3/api-docs/**")
//						.permitAll()
//						.anyExchange()
//						.authenticated())
//				.oauth2ResourceServer()
//				.jwt()
//				.and()
//				.and()
//				.csrf()
//				.disable()
//				.build();
//	}
//
}
