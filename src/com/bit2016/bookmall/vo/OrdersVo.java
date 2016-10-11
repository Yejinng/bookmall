package com.bit2016.bookmall.vo;

public class OrdersVo {

	private Long no;
	private String name_email;
	private Long price;
	private String address;
	
	public String getName_email() {
		return name_email;
	}
	public void setName_email(String name_email) {
		this.name_email = name_email;
	}
	
	public Long getNo() {
		return no;
	}
	public Long getPrice() {
		return price;
	}
	public String getAddress() {
		return address;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrdersVo [no=" + no + ", name_email=" + name_email + ", price=" + price + ", address=" + address + "]";
	}
	
		

}
