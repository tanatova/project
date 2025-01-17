package com.example.dockertapsyrma1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@SpringBootApplication
@RestController
public class Dockertapsyrma1Application {

	@GetMapping("/message")
	public String message() {
		return "Kosh keldin";
	}

	public static void main(String[] args) {
		SpringApplication.run(Dockertapsyrma1Application.class, args);
	}

}
