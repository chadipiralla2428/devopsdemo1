package com.example.decopsdemo1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/devops")
public class Decopsdemo1Application {
	@GetMapping("/get")
	public String demo() {
		return "welcome to K8s";
	}

	public static void main(String[] args) {
		SpringApplication.run(Decopsdemo1Application.class, args);
	}

}
