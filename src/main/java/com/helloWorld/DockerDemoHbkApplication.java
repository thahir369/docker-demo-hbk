package com.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoHbkApplication {


	@GetMapping("/")
	public String home(){
		return "<h2>This is sample application to convert into docker image and push into docker hub<h2>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoHbkApplication.class, args);
	}

}
