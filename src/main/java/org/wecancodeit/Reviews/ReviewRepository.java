package org.wecancodeit.Reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Repository;



@Repository
public class ReviewRepository {
	
	
	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review guitarReview = new Review(1L, "Gibson", "J45", 2013, "J45.jpg", "The Workhorse.  This guitar is a well rounded intstrument with a natural, warm and earthy tone.  At home on stage or around a campfire, this guitar is the most used of all of the guitars I personally own, and it shows its wear well.  ");
		Review guitarReview2 = new Review(2L, "Gibson", "Les Paul Deluxe", 1969, "deluxe.jpg", "The Goldtop.  This guitar has the wonderful playablility and superb looks of a well worn, vintage Les Paul Goldtop, but is equipped with mini humbuckers, giving it a little different tonal range than a traditional Les Paul Standard.  For a Les Paul that knows how to cut through a mix, this is the go to.");
		Review guitarReview3 = new Review(3L, "Fender", "JazzMaster", 2012, "jazzmaster.jpg", "Tobacco Burst.  The pickups in this guitar offer a unique mix of single coil fuzziness and warmth that other Fender models dont seem to hit.  It took some love to get this guitar set up properly, but once that feat was accomplished, it found a warm place in my heart. ");
		Review guitarReview4 = new Review(4L, "Washburn", "Nylon", 2010, "washburn.jpg", "Classical on a budget.  I cant say enough about how far above its weight this guitar has punched.  I bought it used, and for a song, and though I envisioned it originally as a novelty guitar for rare classical adventures, it has been one of my favorite purchases.  This guitar is commonly put in alternate tunings and handles it without much complaining. No fuss, just a fun guitar to have around.");
		Review guitarReview5 = new Review(5L, "Gibson", "Les Paul Custom", 1968, "Custom.jpg", "Black Beauty.  I think this guitar is the most iconic instrument ever created.  Incredibly fast, Insanely beautiful, this is THE ONE to Rule them All!  ");
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
