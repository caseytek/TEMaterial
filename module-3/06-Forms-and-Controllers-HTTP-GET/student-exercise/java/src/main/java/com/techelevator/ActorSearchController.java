package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping({"/", "/actorList"})
	public String showSearchActorForm() {
		return "actorList";
	}

	/* What about here? */
	@RequestMapping("/actorSearch")
	public String searchActors(@RequestParam String actorName, ModelMap map) {
		List<Actor> actorSearchList = actorDao.getMatchingActors(actorName);
		map.put("actors", actorSearchList);
			/* What arguments go here to get parameters from the page? */
		/* Call the model and pass values to the jsp */
		return "actorList";
	}
}
