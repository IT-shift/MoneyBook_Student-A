/**
 * 
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.example.demo.dto.Students;
//import com.example.demo.form.ContactForm;

import com.example.demo.form.ContactForm;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact(ContactForm form, Model model) {
		return "contact";
	}
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirm(@Validated @ModelAttribute ContactForm form,
BindingResult result, Model model) {
		if(result.hasErrors()){
			return "contact";
		} else {
			return "confirm";
		}
	}
}

//@Controller
//public class ContactController {
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	@RequestMapping("/contact")
//	public String contact(ContactForm form, Model model) {
//		return "contact";
//	}
//	
//	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
//	public String confirm(@Validated @ModelAttribute ContactForm form, BindingResult result,Model model) {
//		List<Map<String, Object>> list;
//		list = jdbcTemplate.queryForList("select * from students");
//		
//		List<Students> studentsList = new ArrayList<>();
//		for (Map<String, Object> map : list) {
//		Students students = new Students();
//		students.setName((String) map.get("name"));
//		students.setAge((BigDecimal) map.get("age"));
//		students.setHometown((String) map.get("hometown"));
//		studentsList.add(students);
//		
//		}
//		
//		model.addAttribute("students", studentsList);
//		return "confirm";
//	}
//}
