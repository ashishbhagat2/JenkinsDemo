package com.abtech.Jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hi Ashish B";
	}

}
