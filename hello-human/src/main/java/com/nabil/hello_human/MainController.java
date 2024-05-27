package com.nabil.hello_human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String index(
			@RequestParam(value = "name", required = false, defaultValue="Human") String name,
			@RequestParam(value = "last_name", required = false, defaultValue="") String lastName,
			@RequestParam(value = "times", required = false, defaultValue="1") Integer times) {
		String greeting = "";
			
		for(int i = 0; i < times; i++) {
			greeting += "Hello " + name + " " + lastName + " ";
		}
		
		return greeting;
	}

}