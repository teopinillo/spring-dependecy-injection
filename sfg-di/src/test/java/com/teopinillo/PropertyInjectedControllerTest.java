package com.teopinillo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.teopinillo.controllers.PropertyInjectedController;
import com.teopinillo.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		System.out.println (controller.getGreeting());
		fail("Not yet implemented");
	}

}
