package com.techelevator.post;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class UserJdbcDao implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserJdbcDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// To insert a date into a prepared statement, wrap the date in
	// `Date.valueOf()`
	// method: `Date.valueOf(myObject.getCreated())`

	@Override
	public void save(User newUser) {
	String sqlInsertUser = "INSERT INTO users(id, first_name, last_name, email, " +
			"role, created) VALUES(?, ?, ?, ?, ?, ?)";
	
			newUser.setId(Long.valueOf(getMaxUserId() + 1));
								
				jdbcTemplate.update(sqlInsertUser,
					newUser.getId(),
					newUser.getFirstName(),
					newUser.getLastName(),
					newUser.getEmail(),
					newUser.getRole(),
					Date.valueOf(newUser.getCreated()));
				}

		
		// Implement this method to save user to database

	@Override
	public List<User> getAllUsers() {
		// Implement this method to pull in all users from database
		List <User> userList = new ArrayList<>();
		String sqlGetAllUsers = "SELECT * FROM users";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllUsers);
		while (results.next()) {
			User nextUser = new User();
			nextUser = mapRowToUser(results);
			userList.add(nextUser);
		}
		return userList;
	} 


	private User mapRowToUser(SqlRowSet results) {
		User userRow = new User();
		userRow.setId(results.getLong("id"));
		userRow.setFirstName(results.getString("first_name"));
		userRow.setLastName(results.getString("last_name"));
		userRow.setEmail(results.getString("email"));
		userRow.setRole(results.getString("role"));
		userRow.setCreated(results.getDate("created").toLocalDate());
		return userRow;
	}

	private int getMaxUserId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT MAX(id) FROM users");
		if (nextIdResult.next()) {
			return nextIdResult.getInt(1);
		} else {
			throw new RuntimeException("Uhoh!  Something went wrong while getting the next id!");
		}
	} 
}
