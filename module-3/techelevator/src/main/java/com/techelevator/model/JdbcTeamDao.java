package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcTeamDao implements TeamDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcTeamDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Team> retrieveTeams() {
		List<Team> teamList = new ArrayList<>();
		String sqlSelectAllTeams = "SELECT team_id, team_name, division_name, wins, losses FROM team" + 
				" JOIN division ON team.division_id = division.division_id;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllTeams);
		while(results.next()) {
			Team team = new Team();
			team.setTeamId(results.getInt("team_id"));
			team.setDivision(results.getString("division_name"));
			team.setTeamName(results.getString("team_name"));
			team.setWins(results.getInt("wins"));
			team.setWins(results.getInt("losses"));
			teamList.add(team);
		}
		
		return teamList;
	}

	@Override
	public void updateData(Team team) {
		int divId = fetchDivisionId(team.getDivision());
		String sql = "INSERT INTO team(division_id, team_name, wins, losses)"
				+ " VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, divId, team.getTeamName(), team.getWins(), team.getLosses());
	}
	
	private int fetchDivisionId(String divName) {
		String sql = "Select division_id from division where"
				+ " division_name = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, divName);
		int output = 0;
		while (results.next()) {
			output = results.getInt("division_id");
		}
		return output;
	}
	

}
