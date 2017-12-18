package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	
	@RequestMapping("/")
	  public String home() {
		LOG.info("Handling home");
	    myNewMethod();
	    return "Hello World";
	  }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public static void myNewMethod(){
		LOG.info("Im inside my new method");
	}
}
