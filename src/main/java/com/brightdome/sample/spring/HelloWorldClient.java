package com.brightdome.sample.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class HelloWorldClient {
	
	@Autowired
	HelloWorldService service;
	
	public void sayHello() {
		service.sayHello();
	}
}