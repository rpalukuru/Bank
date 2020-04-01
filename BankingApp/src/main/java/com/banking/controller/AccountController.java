package com.banking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@RequestMapping(value = "/hello")
	public String hello()
	{
		return "Hello Welcome to Banking ";
	}

}
