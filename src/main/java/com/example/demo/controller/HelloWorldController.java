package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Students;

@Controller
public class HelloWorldController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping("/helloworld")
	public String helloworld(Model model) {
		List<Map<String, Object>> list;
		list = jdbcTemplate.queryForList("select * from students where age >= 21");

		List<Students> studentsList = new ArrayList<>();
		for (Map<String, Object> map : list) {
			Students students = new Students();
			students.setName((String) map.get("name"));
			students.setAge((BigDecimal) map.get("age"));
			students.setHometown((String) map.get("hometown"));
			studentsList.add(students);
		}

		model.addAttribute("students", studentsList);
		return "helloworld";
	}
}