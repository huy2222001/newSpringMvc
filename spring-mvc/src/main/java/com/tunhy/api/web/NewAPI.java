package com.tunhy.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.tunhy.service.INewService;

@RestController(value = "newAPIOfWeb")
public class NewAPI {
	@Autowired
	private INewService newService;
	
	
	
}
