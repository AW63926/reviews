package org.wecancodeit.Reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;




public class ReviewRepositoryTest {
	
	ReviewRepository underTest;
	//private Review guitarOne = new Review(1L, "Gibson", "J45", 2013, "none", "WorkHorse");
	
	//private Review guitarTwo = new Review(2L, "Gibson", "Les Paul Deluxe", 1969, "noImg", "Goldtop");
	
	@Test
	public void shouldFindReview() {
		underTest = new ReviewRepository();
		Review testReview = underTest.findReview(1L);
		String brandResult = testReview.getBrand();
		assertEquals(brandResult, "Gibson");
	}
	
	@Test
	public void shouldReturnBrandNameFender() {
		underTest = new ReviewRepository();
		Review testReview = underTest.findReview(3L);
		String brandResult = testReview.getBrand();
		assertEquals(brandResult, "Fender");
	}
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository();
		Review testReview1 = underTest.findReview(1L);
		System.out.println(testReview1.getBrand());
		Review testReview2 = underTest.findReview(2L);
		Collection<Review> result = underTest.findAll();
		
	}
	

}
