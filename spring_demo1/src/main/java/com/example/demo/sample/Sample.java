package com.example.demo.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@RequestMapping("/hello")
	public String helloprint() {
		return "welcome";
		
	}
}
