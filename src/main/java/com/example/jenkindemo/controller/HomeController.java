package com.example.jenkindemo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
	@GetMapping("/msg")
	public String mess()
	{
		return "message fromm rohan";
	}
	@GetMapping("/msg2")
	public String mes()
	{
		return "message from rjb007";
	}

}
