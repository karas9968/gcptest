package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping(value="/")
	public String helloWorld() {
		return "hello world";
	}

}
