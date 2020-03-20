package com.techelevator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.daos.PuppyDao;
import com.techelevator.exceptions.PuppyNotFoundException;
import com.techelevator.models.Puppy;

/**
 * Puppies API Controller
 * 
 * This controller should handle the following API requests:
 * 
 * GET - /api/allPuppies - return all Puppies in the data base as an array of JSON objects
 * 
 * GET - /api/puppy/# - Returns the Puppy from the data based whose id matches the # specified
 * 
 * POST - /api/newPuppy - Add a Puppy to the database using the Puppy information in the API request
 * 
 * DELETE - /api/removePuppy/# - Delete the Puppy from the database whose id matches the # specified 
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class PuppiesController {
	
	@Autowired
	PuppyDao thePuppies;
	
	@GetMapping("/allPuppies")
	public List<Puppy> getAllPuppies(){
		return thePuppies.getPuppies();
	}
	
	@GetMapping("/puppy/{id}")
	public Puppy getPuppy(@PathVariable int id) {
		Puppy foundPuppy = thePuppies.getPuppy(id);
		if (foundPuppy != null) {
			return foundPuppy;
		} else {
			throw new PuppyNotFoundException("Puppy not found.");
		} 
	}
	
	@PostMapping("/newPuppy")
	@ResponseStatus(HttpStatus.CREATED)
	public void addPuppy(@RequestBody Puppy puppy) {
	 thePuppies.savePuppy(puppy);
	}
	
	@DeleteMapping("removePuppy/{id}")
	public void delete(@PathVariable int id) {
		Puppy puppy = thePuppies.getPuppy(id);
		if(puppy != null) {
			thePuppies.removePuppy(id);
		} else {
			throw new PuppyNotFoundException("Puppy not found.");
		}
	}
	
}
