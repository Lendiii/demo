package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@RequestMapping("/")
	public String indexPage()
	{
		return "Hello World";
	}
	
	@GetMapping(value="/demo")
	public void retrieve()
	{
		//stage
	}
}