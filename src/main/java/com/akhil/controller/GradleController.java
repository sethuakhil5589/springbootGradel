package com.akhil.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradleController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> greetings(){
		return new ResponseEntity<>("Hello, Welcome to first Gradle Application",HttpStatus.OK);
	}
	
}
