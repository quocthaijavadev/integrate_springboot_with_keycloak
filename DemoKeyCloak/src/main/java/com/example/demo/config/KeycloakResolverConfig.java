package com.example.demo.config;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakResolverConfig {

	/**
	 * Due to some issues in automatic discovery of Keycloak configuration from
	 * application.properties file will not work. So, to overcome this problem, 
	 * we need to define a KeycloakSpringBootConfigResolver bean in a configuration class.
	 * @return
	 */
	@Bean
	public KeycloakConfigResolver keycloakConfigResolver() {
		return new KeycloakSpringBootConfigResolver();
	}

}
