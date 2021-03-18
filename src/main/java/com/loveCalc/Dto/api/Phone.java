package com.loveCalc.Dto.api;

public class Phone {
	private String CounryCod;
	private String  UserName;
	public String getCounryCod() {
		return CounryCod;
	}
	public void setCounryCod(String counryCod) {
		CounryCod = counryCod;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	@Override
	public String toString() {
		return getCounryCod()+getUserName();
	}
	

}
