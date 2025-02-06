package com.example.demo.dto;

import java.math.BigDecimal;

public class Students {

	private BigDecimal students_id;
	private String name;
	private BigDecimal age;
	private String hometown;

	public BigDecimal getStudents_id() {
		return students_id;
	}

	public void setStudents_id(BigDecimal students_id) {
		this.students_id = students_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
}