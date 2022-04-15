package com.manjeet.learnit.learnactions.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Greetings {

	@GetMapping("/greet")
	public ResponseEntity<String> greetUser(HttpServletRequest request) {
		ResponseEntity<String> greetingsResponse = null;
		HttpHeaders responseHeaders = new HttpHeaders();
		greetingsResponse = new ResponseEntity<>("Welcome Manjeet", responseHeaders,
				HttpStatus.OK);
		return greetingsResponse;
	}
}
