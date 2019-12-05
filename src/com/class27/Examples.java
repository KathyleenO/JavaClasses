package com.class27;

public class Examples {

	//OVERIDDEN METHOD 
	public String helloName(String str) {
		return str;
	}
	//OVERLOADING
	public String helloName(String str, String str2) {
		return str+ " " +str2;
	}

}
class smallExample extends Examples{
	
	//OVERRIDING METHOD
	public String helloName(String str) {
		return "Hello" +str;
	}
	
	
}