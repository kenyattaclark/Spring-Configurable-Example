package com.brightdome.sample.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("/META-INF/applicationContext.xml" );
		HelloWorldClient client = new HelloWorldClient();
		client.sayHello();
	}
}