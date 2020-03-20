package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Register;

@Controller
public class UserController {
	
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String getLoginScreen(ModelMap map) {
		
		if(!map.containsAttribute("login")) {
			map.put("login", new Login());
		}
		return "login";
	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String processLogin(@Valid @ModelAttribute Login login,
								BindingResult result,
								RedirectAttributes flash) {
	flash.addFlashAttribute("login", login);
	if(result.hasErrors()) {
		flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
		return "redirect:/login";
	}
	String type = "logged in.";
	flash.addFlashAttribute("confirmationType", type);
	return "redirect:/confirmation";
	}
	
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String getregisterScreen(ModelMap map) {
		if(!map.containsAttribute("register")) {
			map.put("register", new Register());
		}
		return "register";
	}
	
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String proccessRegistration(@Valid @ModelAttribute Register register,
										BindingResult result,
										RedirectAttributes flash) {
		flash.addFlashAttribute("register", register);
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "register", result);
			return "redirect:/register";
		}
		String type = "registered.";
		flash.addFlashAttribute("confirmationType", type);
		return "redirect:/confirmation";
	}
	
	@RequestMapping(path = "/confirmation", method = RequestMethod.GET)
	public String confirmationPage() {
		return "/confirmation";
	}
	
	
	
	
	

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	// GET: /login
	// Return the empty login view

	// POST: /login
	// Validate the model and redirect to a confirmation page if validation is
	// successful. Return the login view (if validation fails).

	// GET: /confirmation
	// Return the confirmation view
}
