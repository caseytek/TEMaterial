package com.techelevator.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DummyController {

	
	@Autowired
	private ReviewDao reviewDao;
	
	@RequestMapping({"/", "/homePage"})
	public String homePageDisplay(ModelMap map) {
	List <Review> reviewList = reviewDao.getAllReviews();
	List <String> dateList = new ArrayList<>();
	map.put("reviews", reviewList);
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
	for(Review review: reviewList) {
		
		String timeString = review.getDateSubmitted().toString();
		timeString = timeString.substring(0, 10);
		dateList.add(timeString);
	}
	
	map.put("dates", dateList);
	return "homePage";
		
	}
	
	@RequestMapping(path="/leaveReview", method=RequestMethod.GET)
	public String leaveReviewDisplay() {
		return "leaveReview";
	}
	
	@RequestMapping(path="/leaveReview", method=RequestMethod.POST)
	public String processForum(@RequestParam String title,
								@RequestParam String text,
								@RequestParam int rating,
								@RequestParam String username) {
		Review review = new Review();
		review.setUsername(username);
		review.setTitle(title);
		review.setText(text);
		review.setRating(rating);
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		
		return "redirect:/homePage";
		
	}
}
