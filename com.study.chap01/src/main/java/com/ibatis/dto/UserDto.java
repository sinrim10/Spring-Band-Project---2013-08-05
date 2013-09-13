package com.ibatis.dto;

public class UserDto {
	public UserDto(String usrid, String uname, String upw, String ucmt) {
		super();
		this.usrid = usrid;
		this.uname = uname;
		this.upw = upw;
		this.ucmt = ucmt;
	}
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	private String usrid, uname, upw, ucmt,newUpw;

	public String getNewUpw() {
		return newUpw;
	}
	public void setNewUpw(String newUpw) {
		this.newUpw = newUpw;
	}
	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUcmt() {
		return ucmt;
	}

	public void setUcmt(String ucmt) {
		this.ucmt = ucmt;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUpw() {
		return upw;
	}
	
	
}
