package org.wecancodeit.Reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Repository;



@Repository
public class ReviewRepository {
	
	
	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review guitarReview = new Review(1L, "Gibson", "J45", 2013, "J45.jpg", "The Workhorse");
		Review guitarReview2 = new Review(2L, "Gibson", "Les Paul Deluxe", 1969, "deluxe.jpg", "Goldtop");
		Review guitarReview3 = new Review(3L, "Fender", "JazzMaster", 2012, "jazzmaster.jpg", "Tobacco Burst");
		Review guitarReview4 = new Review(4L, "Washburn", "Nylon", 2010, "washburn.jpg", "Classical");
		Review guitarReview5 = new Review(5L, "Gibson", "Les Paul Custom", 1968, "Custom.jpg", "Black Beauty");
		reviewList.put(guitarReview.getId(), guitarReview);
		reviewList.put(guitarReview2.getId(), guitarReview2);
		reviewList.put(guitarReview3.getId(), guitarReview3);
		reviewList.put(guitarReview4.getId(), guitarReview4);
		reviewList.put(guitarReview5.getId(), guitarReview5);
	}
	
	public Review findReview(long id) {
		return reviewList.get(id);
	}
	
	public Collection<Review> findAll() {
		return reviewList.values();
	}
	
	

}
