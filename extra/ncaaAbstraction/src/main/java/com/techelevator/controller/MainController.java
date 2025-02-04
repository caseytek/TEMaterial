package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.Team;
import com.techelevator.model.TeamDAO;

@Controller
public class MainController {
	
	@Autowired
	private TeamDAO teamDao;
	
	@RequestMapping("/")
	public String displayHome(ModelMap modelMap) {
		
		List<Team> listOfTeams = teamDao.retrieveTeams();		
		modelMap.put("teamSummary", listOfTeams);
		
		return "home";
		
	}
	
	//http://localhost:8080/ncaa/details?team=Michigan+State&wins=21&losses=9
	@RequestMapping("/details")
	public String displayDetails(@RequestParam String team,
			@RequestParam int wins,
			@RequestParam int losses, 
			ModelMap modelMap) {
		
		double lWRatio = (double)losses / (double)wins;
		modelMap.put("teamName", team);
		modelMap.put("ratio", lWRatio);
		
		return "detail";
	}
}
