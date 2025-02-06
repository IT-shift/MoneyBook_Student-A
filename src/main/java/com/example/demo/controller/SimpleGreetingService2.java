/**
 * 
 */
package com.example.demo.controller;

import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class SimpleGreetingService2 implements GreetingService2 {

	@Override
	public String greet(String name) {
		return "Hello, " + name;
	}
}