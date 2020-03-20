package com.techelevator.city;

import org.apache.commons.dbcp2.BasicDataSource;

public class DAOExample {

	public static void main(String[] args) {
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
		
		CityDao dao = new JdbcCityDao(worldDataSource);
		
		City smallville = new City();
		smallville.setCountryCode("USA");
		smallville.setDistrict("Kansas");
		smallville.setName("Smallville");
		smallville.setPopulation(42080);
		
		dao.save(smallville);
		
		City theCity = dao.findCityById(smallville.getId());
		
		sout 
		
	}

}
