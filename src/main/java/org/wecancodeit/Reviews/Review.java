package org.wecancodeit.Reviews;

public class Review {
	private long id;
	private String brand;
	private String model;
	private int year;
	private String img;
	private String content;
	
	
	
	
	
	public Review(long id, String brand, String model, int year, String img, String content) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.img = img;
		this.content = content;
	}
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public String getBrand() {
		return brand;
	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
	public String getModel() {
		return model;
	}
//	public void setModel(String model) {
//		this.model = model;
//	}
	public int getYear() {
		return year;
	}
//	public void setYear(int year) {
//		this.year = year;
//	}
	public String getImgUrl() {
		return img;
	}
//	public void setImgUrl(String imgUrl) {
//		this.imgUrl = imgUrl;
//	}
	public String getContent() {
		return content;
	}
//	public void setContent(String content) {
//		this.content = content;
//	}

}
