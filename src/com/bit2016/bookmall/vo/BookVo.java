package com.bit2016.bookmall.vo;

public class BookVo {

	private String title;
	private Long price;
	private Long category_no;
	private String category_name;        
	public String getTitle() {
		return title;
	}
	public Long getPrice() {
		return price;
	}
	public Long getCategory_no() {
		return category_no;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public void setCategory_no(Long category_no) {
		this.category_no = category_no;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
	public String toString() {
		return "BookVo [title=" + title + ", price=" + price + ", category_no=" + category_no + ", category_name="
				+ category_name + "]";
	}
	
		

}
