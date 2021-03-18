package com.loveCalc.Dto.api;

public class registerInfo {
	private String name;
	private String username;
	private char [] password;
	private String country;
	private String[] hobby;
	private String gender;
	private communicationDto comm;

	public communicationDto getComm() {
		return comm;
	}

	public void setComm(communicationDto comm) {
		this.comm = comm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}


	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

}
