package com.Restful.microservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Restful.microservice.model.Courses;

@RestController
public class Service {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello");
		return "Helloworld";
	}
	@GetMapping("/ms")
	public List<Courses> retrieveCourses() {
		return Arrays.asList(
				new Courses(1, "Learn AWS", "28minustes")
				
				);
				
	}
	

}
