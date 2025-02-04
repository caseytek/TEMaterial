package com.techelelevator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;

public class JdbcExample {
	
	public static void main(String [] args) throws SQLException {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/dvdstore");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		Connection conn1 = dataSource.getConnection();
		Statement stmt = conn1.createStatement();
		
		String sqlActionFilmsReleasedIn2006 = "SELECT film.title, film.release_year " +
		" FROM film JOIN film_category ON film.film_id = film_category.film_id " +
		" JOIN category ON category.category_id = film_category.category_id " +
		" WHERE film.release_year = 2006 AND category.name = 'Action'";
		
		ResultSet results = stmt.executeQuery(sqlActionFilmsReleasedIn2006);
		while(results.next()) {
			String title = results.getString("title"); //"title " is the name of the sql column name
			int releaseYear = results.getInt("release_year");
			System.out.printf("%-30s %5d\n", title, releaseYear);
		}
		
		String firstName = "Nick";
		String lastName = "O'Malley";
		
		
		lastName = "Stallone";
		String sqlMoviesByActor = "SELECT film.title " +
		"FROM film JOIN film_actor ON film.film_id = film_actor.film_id " +
		"JOIN actor ON actor.actor_id = film_actor.actor_id " +
		"WHERE actor.first_name = '" +  firstName.toUpperCase() + "' " + 
		"AND actor.last_name = '" + lastName.toUpperCase() + "' ";
		
		results = stmt.executeQuery(sqlMoviesByActor);
		
		System.out.println("Films starring: " + firstName + " " + lastName);
		
		while(results.next()) {
			String title = results.getString("title");
			System.out.println(title);
		}
		
		String sqlMoviesByActorParameterIzed = "SELECT film.title " +
				"FROM film JOIN film_actor ON film.film_id = film_actor.film_id " +
				"JOIN actor ON actor.actor_id = film_actor.actor_id " +
				"WHERE actor.first_name = ? " + 
				"AND actor.last_name = ? ";
		
		PreparedStatement movieByActorStmt = conn1.prepareStatement(sqlMoviesByActorParameterIzed);
		movieByActorStmt.setString(1, firstName.toUpperCase());
		movieByActorStmt.setString(2,  lastName.toUpperCase());
		
		System.out.println("\n\n\nMovies by actor again:");
		
		results = movieByActorStmt.executeQuery();
		
		while(results.next()) {
			String title = results.getString("title");
			System.out.println(title);
		}
	}
}
