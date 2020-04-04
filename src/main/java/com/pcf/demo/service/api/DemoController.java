package com.pcf.demo.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pcf.demo.model.DemoModel;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

	@GetMapping("/test")
	public String demoTest() {
		return "Hello from Demo Application deployed in PCF";
	}

	@PostMapping("/post")
	public DemoModel demoPost(@RequestBody DemoModel demoModel) {

		return demoModel;

	}

}
