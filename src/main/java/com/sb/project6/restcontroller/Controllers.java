package com.sb.project6.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.project6.service.Services;

@RestController
public class Controllers {
	
	@Autowired
	private Services services;

	//sample testing method(YOU CAN iGnored)
	@GetMapping("/getsimplemsg")
	public String getmessgae()
	{
		return "Welcome to Group F for Project 6... ";
	}
	

	@GetMapping("/getmsg")
	public String getmsg()
	{
		String msg=services.getmsg();
		
		return msg;
	
	}
}
