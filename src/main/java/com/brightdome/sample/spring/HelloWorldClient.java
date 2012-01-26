package com.brightdome.sample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class HelloWorldClient {
	
	@Autowired
	private HelloWorldService service;
	
	public void sayHello() {
		// Used injected instance of service
		service.sayHello();
	}
}