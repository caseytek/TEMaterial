package com.techelevator.validation.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;


public class Register {
	
	@NotBlank(message="First name is a required field.")
	@Length(max = 20)
	private String firstName;
	
	@NotBlank(message="Last name is a required field.")
	@Length(max = 20)
	private String lastName;
	
	@NotBlank(message="Email Address is a required field.")
	@Email (message="Please enter a valid email address")
	private String email;
	
	@NotBlank(message="Cofirm Email Address is a required field.")
	private String confirmEmail;
	
	@NotBlank(message="Password is a required field.")
	@Length(min = 8, max = 20)
	private String password;
	
	@NotBlank(message="Confirm password is a required field.")
	private String confirmPassword;
	
	@NotBlank(message="Birthday is a required field.")
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private String birthday;
	
	
	@NotNull(message= "You must enter a number of tickets")
	@Min(value = 1, message="Must enter at least 1 ticket") 
	@Max(value = 10, message="Must enter 10 tickets or less")
	private Integer numberOfTickets;
	
	private boolean emailMatch;
	
	private boolean passwordMatch;
	
	@AssertTrue(message = "Emails must match")
	public boolean isEmailMatch(){
		if(email != null ) {
			return email.contentEquals(confirmEmail);
		}
		return true;
	}
	
	@AssertTrue(message = "Passwords must match")
	public boolean isPasswordMatch(){
		boolean isMatching = false;
		if(password != null) {
			return password.contentEquals(confirmPassword);
		}
		return true;
	}
	
	public Register() {
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(Integer numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	
	
	
	

}
