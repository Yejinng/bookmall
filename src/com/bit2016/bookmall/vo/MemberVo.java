package com.bit2016.bookmall.vo;

public class MemberVo {

	private String name;
	private String tel;
	private String email;
	private String password;
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MemberVo [name=" + name + ", tel=" + tel + ", email=" + email + ", password=" + password + "]";
	}

		

}
