package com.bit2016.bookmall.vo;

public class CategoryVo {

	private Long no;
	private String name;
	
	public Long getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", name=" + name + "]";
	}

}
