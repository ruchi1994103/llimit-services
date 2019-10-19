package com.example.limitservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitservices.bean.Configuration;
import com.example.limitservices.bean.LimitConfiguration;

@RestController
public class LimitServiceController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limit")
	public LimitConfiguration retrieveLimitFromConfiguration() {
		return new LimitConfiguration( config.getMinimum(),config.getMaximum());
	}
	
}
