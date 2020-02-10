package com.eureka.gallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient 		
//@EnableCircuitBreaker 	// Enable circuit breakers
public class SpringEurekaGalleryApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaGalleryApp.class, args);
	}
}

@Configuration
class RestTemplateConfig {
	
	
	@Bean
	@LoadBalanced		
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}