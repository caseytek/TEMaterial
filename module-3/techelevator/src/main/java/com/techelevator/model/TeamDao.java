package com.techelevator.model;

import java.util.List;

public interface TeamDao {

	public List<Team> retrieveTeams();
	
	public void updateData(Team team);
	
}
