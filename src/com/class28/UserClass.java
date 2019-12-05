package com.class28;

public class UserClass {

	String mobile;
	String name;
	
	UserClass(String mobile, String name){
		this.mobile=mobile;
		this.name=name;
	}
	
	
	
}

class UserInfo extends UserClass{
	
	String userAdress;
	
	
	UserInfo(String mobile, String name, String userAdress) {
		super(mobile, name);
		this.userAdress=userAdress;
	}
 public void UserDetails() {
	 System.out.println(name+ " " +mobile+ " " +userAdress);
 }
	
	
	
}