package com.techelevator.city;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcCityDao implements CityDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcCityDao(DataSource dataSource) {
	jdbcTemplate = new JdbcTemplate(dataSource);	
	}
	
	@Override
	public City findCityById(int id) {
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population " + 
		"FROM city WHERE id = ?";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if (results.next()) {
			theCity = mapRowToCity(results);
		}
		return theCity;
	}
	
	private City mapRowToCity(SqlRowSet results) {
		City theCity = new City();
		theCity.setId(results.getInt("id"));
		theCity.setName(results.getString("name"));
		theCity.setCountryCode(results.getString("countrycode"));
		theCity.setDistrict(results.getString("district"));
		theCity.setPopulation(results.getInt("population"));
		return theCity;
	}

	@Override
	public void save(City newCity) {
		String sqlInsertCity = "INSERT INTO city(name, countrycode, district, population) " + 
				"VALUES(?, ?, ?, ?)";
		jdbcTemplate.update(sqlInsertCity,
				newCity.getName(), 
				newCity.getCountryCode(),
				newCity.getDistrict(), 
				newCity.getPopulation());
		
	}

	@Override
	public List<City> findCitiesByCountryCode(String countryCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> findCitiesByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub

	}

}
