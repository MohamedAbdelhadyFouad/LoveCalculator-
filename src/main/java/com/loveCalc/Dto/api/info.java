package com.loveCalc.Dto.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class info {
	@NotEmpty
	private String userName;
	@NotEmpty
	private String crushName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}
