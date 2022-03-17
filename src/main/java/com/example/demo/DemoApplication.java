package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Following three imports provide annotations for a Controller.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * Since this class is the entry point to the program, we annotate it as a
 * SpringBootApplication. Additionally, since it is going to handle HTTP
 * requests, we annotate it as a Controller.
 */
@SpringBootApplication
@RestController
public class DemoApplication {

	// Application begins here.
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Executes whenever "/hello" is appended to the base URL.
	// The RequestParam defines "name" as the name of the value the user
	// can pass in, e.g. /hello?name=Pavan sets name equal to Pavan.
	// The String parameter called name is where Java stores it when it
	// receives the request.
	@GetMapping("/hello")
	public String hello(
		@RequestParam(value="name", defaultValue="World") String name) {
		return String.format("Hello %s!", name);
	}
}
