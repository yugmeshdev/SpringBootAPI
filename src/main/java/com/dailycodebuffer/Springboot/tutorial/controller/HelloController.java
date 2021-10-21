package com.dailycodebuffer.Springboot.tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//controller has @Component inbuilt
//restcontroller always response body
@RestController
public class HelloController {
	
		//@RequestMapping(value="/",method=RequestMethod.GET)
		@GetMapping("/")
		public String helloWorld() {
			return "Welcome mfs!";
		}
}
