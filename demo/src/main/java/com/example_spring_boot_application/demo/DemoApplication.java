package com.example_spring_boot_application.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	@RestController
	class HelloWorldController {

		@GetMapping("/")
		String hello() {
			return "🎉 Hello Docker World ! Welcome Team Darwin ! 🎉 ";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
