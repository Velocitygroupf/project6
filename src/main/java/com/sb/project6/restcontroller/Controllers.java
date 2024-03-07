package com.sb.project6.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controllers {

	@GetMapping("/getsimplemsg")
	public String getmessgae()
	{
		return "Welcome to Group F for Project 6... ";
	}
}
