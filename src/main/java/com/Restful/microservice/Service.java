package com.Restful.microservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restful.microservice.model.Courses;

@RestController
public class Service {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello");
		return "Helloworld";
	}
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveCourses() {
		return configuration;
				
	}
	

}
