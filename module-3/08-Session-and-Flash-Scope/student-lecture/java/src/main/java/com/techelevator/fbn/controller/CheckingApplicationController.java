package com.techelevator.fbn.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.fbn.model.CheckingAccountApplication;

@Controller
@RequestMapping("/checkingApplication") //adds a base path
public class CheckingApplicationController {

	@RequestMapping(path = { "/", "/personalInformationInput" }, method = RequestMethod.GET)
	public String displayPersonalInformationInput() {
		return "checkingApplication/personalInformationInput";
	}
	
	@RequestMapping(path= {"/personalInformationInput"}, method = RequestMethod.POST)
	public String processPersonalInformationForum(@RequestParam String firstName,
													@RequestParam String lastName,
													@DateTimeFormat(pattern = "MM/dd/yyy") @RequestParam LocalDate dateOfBirth,
													//datetimeformat says that data must be in this format
													@RequestParam String stateOfBirth,
													@RequestParam String emailAddress,
													@RequestParam String phoneNumber,
													HttpSession session
													) {
		CheckingAccountApplication app = new CheckingAccountApplication();
		app.setFirstName(firstName);
		app.setLastName(lastName);
		app.setDateOfBirth(dateOfBirth);
		app.setStateOfBirth(stateOfBirth);
		app.setEmailAddress(emailAddress);
		app.setPhoneNumber(phoneNumber);
		
		session.setAttribute("application", app); //can use application 
												//in different redirects to set different attributes
		
		
		return "redirect:/checkingApplication/addressInput";
	}
	
	@RequestMapping (path= {"/addressInput"}, method=RequestMethod.GET)
	public String displayAddressInput() {
		return "redirect:/checkingApplication/addressInput"; 
	}
	
	@RequestMapping(path= {"/addressInput"}, method= RequestMethod.POST)
	public String displayaddressInput(@RequestParam String streetAddress,
									@RequestParam String apartmentNumber,
									@RequestParam String city,
									@RequestParam String state,
									@RequestParam String zipCode,
									HttpSession session) {
		CheckingAccountApplication application = (CheckingAccountApplication) session.getAttribute("application");
		application.setAddressStreet(streetAddress);
		application.setAddressApartment(apartmentNumber);
		application.setAddressCity(city);
		application.setAddressState(state);
		application.setAddressZip(zipCode);
		
		session.setAttribute("application", application);

		return "redirect:/checkingApplication/summary";
	}
	
	@RequestMapping("/summary")
	public String displaySummary() {
		return "checkingApplication/summary";
	}
	

	
	@RequestMapping(path = {"/thankYou"}, method = RequestMethod.GET)
	public String displayThankYou() {
		return "checkingApplication/thankYou";
	}
	
	@RequestMapping("/test")
	public String test(HttpSession session) {
		session.invalidate();
		return "checkingApplication/test";
	}
	

	
}
