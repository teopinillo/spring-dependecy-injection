package com.teopinillo.controllers;

import com.teopinillo.services.GreetingService;

public class PropertyInjectedController {
	public GreetingService greetingService;
	public String getGreeting() {
		return greetingService.sayHello();
	}
}
