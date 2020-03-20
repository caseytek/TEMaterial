package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.Team;
import com.techelevator.model.TeamDao;


@Controller
public class MainController {
	
	@Autowired
	private TeamDao teamDao;
	
	@RequestMapping("/")
	public String displayHome(ModelMap map) {
		List<Team> listOfTeams = teamDao.retrieveTeams();
		System.out.println(listOfTeams.get(0).getTeamName());
		
		map.put("teamSummary", listOfTeams);
		
		return "home";
	}
	
	@RequestMapping("/details")
	public String displayDetails(@RequestParam String team, @RequestParam int wins, @RequestParam int losses, ModelMap map) {
		double lWRatio = (double)losses/(double)wins;
		map.put("ratio", lWRatio);
		map.put("teamName", team);
		
		return "details";
	}
	
	@RequestMapping("/add")
	public String addForm() {
		return "/addForm";
	}
	
	@RequestMapping(path="/processAdd", method=RequestMethod.POST)
	public String processAdd(@RequestParam String division,
			@RequestParam String team, @RequestParam int wins,
			@RequestParam int losses,
			RedirectAttributes ra) {
		Team teamObj = new Team();
		teamObj.setTeamName(team);
		teamObj.setDivision(division);
		teamObj.setWins(wins);
		teamObj.setLosses(losses);
		
		teamDao.updateData(teamObj);
		ra.addFlashAttribute("teamName", team);
		return "redirect:/confirmation";
	}
	
	@RequestMapping(path="/confirmation", method=RequestMethod.GET)
	public String showConfirmationPage() {
		return "confirmation";
	}

}
