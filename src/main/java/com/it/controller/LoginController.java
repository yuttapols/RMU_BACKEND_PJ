package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.model.LoginRequestModel;
import com.it.model.LoginResponeModel;
import com.it.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login/{id}")
	public LoginResponeModel getLoginById(@PathVariable Integer id) {
		
		return loginService.getLoginById(id);
	}
	
	@PostMapping("/login")
	public void save(@RequestBody LoginRequestModel request) {
		loginService.save(request);
	}
}
