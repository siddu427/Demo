package com.nt.first.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getController {
	@GetMapping(value="/get")
	public String getName() {
		return "hello spring boot";
	}

}
