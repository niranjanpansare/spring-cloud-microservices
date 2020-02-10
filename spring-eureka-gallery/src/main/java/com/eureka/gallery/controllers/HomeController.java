package com.eureka.gallery.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private Environment env;
	
	@RequestMapping("/")
	public String home() {
		return "Hello from Student Gallery Service running at port: " + env.getProperty("local.server.port");
	}
  
}