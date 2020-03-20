package com.techelevator.city;

import java.util.List;

public interface CityDao {
	
	public City findCityById(int id);
	
	public void save(City newCity);
	
	public List <City> findCitiesByCountryCode(String countryCode);
	
	public List <City> findCitiesByDistrict(String district);
	
	public void update(City city);
	
	public void delete(City city);
	
	

}
