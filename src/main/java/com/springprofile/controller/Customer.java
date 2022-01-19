package com.springprofile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Profile(value = { "prod" })
public class Customer {

	@Value(value = "${message.display}")
	private String message;

	@GetMapping
	public String displayMessage() {
		return message;
	}

}
