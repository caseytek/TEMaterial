package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    
    @RequestMapping({"/", "/filmList"})
    public String showFilmSearchForm(){
        return "filmList";
    }

    @RequestMapping("/filmSearch")
    public String searchFilms(@RequestParam(required=false, defaultValue = "0")  int minLength,
    							@RequestParam(required=false, defaultValue = "200")  int maxLength,
    							@RequestParam String genre,
    							ModelMap map) {    		
    		 List <Film> filmSearchList = filmDao.getFilmsBetween(genre, minLength, maxLength);
        map.put("films", filmSearchList);
    	return "filmList";
    }

}