package com.fsb.springboot.studentservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "This is first Spring Boot Application";
	}
}
