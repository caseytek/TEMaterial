package com.techelevator.mailingList.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class MailingListSignUp {
	
	@NotBlank(message="Name is a required field.")
	private String name;
	
	@NotBlank(message="Email is a required field.")
	@Email (message="Please enter a valid email address")
	private String email;
	
	@Pattern(regexp= "^\\(\\d{3}\\)\\d{3}-\\d{4}$", message = "Invalid phone number")
	private String phone;
	
	@Min(value = 13, message = "You're too young") 
	@Max(value = 150, message = "Get off my lawn")
	private Integer age;
	
	
	public MailingListSignUp() {
	}
	
	public MailingListSignUp(String name, String email, String phone, Integer age) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
