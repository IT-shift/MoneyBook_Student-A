package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class TopScreenController {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping("/top")
	public String topscreen(Model model) {
		return "topscreen";
		
	}

}
