/**
 * 
 */
package com.example.demo.form;

/**
 * 
 */
import jakarta.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import lombok.Data;
@Data
public class ContactForm {
@NotBlank
private String firstName;
@NotBlank
private String lastName;
@Range(min=0, max=100 )	
private String age;
@NotBlank
private String job;
}
//import lombok.Data;
//
//@Data
//public class ContactForm {
//	private String firstName;
//	private String lastName;
//	private String age;
//	private String job;
//}
//public class ContactForm {
//	private String firstName;
//	private String lastName;
//	private int age;
//	private String occupation;

//	public String getFirstName() {
//		return firstName;
//	}

//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}

//	public String getLastName() {
//		return lastName;
//	}

//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public String getOccupation() {
//		return occupation;
//	}
//
//	public void setOccupation(String occupation) {
//		this.occupation = occupation;
//	}
//}
