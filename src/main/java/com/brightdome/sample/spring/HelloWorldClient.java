package com.brightdome.sample.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldClient {
	
	@Autowired
	HelloWorldService service;
	
	public void sayHello() {
		service.sayHello();
	}
}