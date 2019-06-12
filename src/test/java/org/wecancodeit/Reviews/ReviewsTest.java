package org.wecancodeit.Reviews;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class ReviewsTest {
	
	
	Review underTest = new Review(1L, "Gibson", "J45", 2013, "noneyet",
				"The workhorse, this guitar is a great writing companion and players guitar, with classic looks, and a natural, warm, earthy sound");
	
	
	@Test
	public void shouldReturnModel() {
//		Review underTest = new Review(1L, "Gibson", "J45", 2013, "noneyet",
//				"The workhorse, this guitar is a great writing companion and players guitar, with classic looks, and a natural, warm, earthy sound");
		String result = underTest.getModel();
		String model = "J45";
		assertEquals(result, model);
	}
	
	@Test
	public void shouldReturnBrand() {
		String result = underTest.getBrand();
		String brand = "Gibson";
		assertEquals(result, brand);
	}
	
	@Test
	public void shouldReturnYear() {
		int result = underTest.getYear();
		int year = 2013;
		assertEquals(result, year);
	}
	
	@Test
	public void shouldReturnId() {
		long result = underTest.getId();
		long id = 1L;
		assertEquals(result, id);
	}

}
