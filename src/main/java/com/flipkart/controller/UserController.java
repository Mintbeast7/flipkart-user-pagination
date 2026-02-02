package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.request.UserRequest;
import com.flipkart.service.UserService;

@RestController
@RequestMapping("/flipkart")
public class UserController {
	
	@Autowired
	UserService service;
    
	@PostMapping("/createuser")
	public String createUser(@RequestBody UserRequest userRequest) {
		String response = service.createUser(userRequest);
		return response;	
	}
	
    @GetMapping("/getuser")
    public String getUser() {
    	service.getUser();
		return null;    	
    }
}
