package com.bit2016.bookmall.vo;

public class CartVo {

	private String title;
	private Long order_no;
	private Long price;
	public String getTitle() {
		return title;
	}
	public Long getOrder_no() {
		return order_no;
	}
	public Long getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setOrder_no(Long order_no) {
		this.order_no = order_no;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartVo [title=" + title + ", order_no=" + order_no + ", price=" + price + "]";
	}


}
