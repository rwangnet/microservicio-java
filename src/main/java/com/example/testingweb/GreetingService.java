package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		System.out.println("Generando una mala práctica aqui!!!!!!!!!!!");
		return "Hello, World";
	}
}
