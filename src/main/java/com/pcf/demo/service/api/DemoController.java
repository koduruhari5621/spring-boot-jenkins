package com.pcf.demo.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

	@GetMapping("/test")
	public String demoTest() {
		return "Hello from Demo Application deployed in PCF";
	}

}
