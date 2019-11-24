package com.class20;

public class AccesModifiers {

	//Public can be access or seen from any PACKAGE or CLASS
	
	public void add1() {
		
	}
	//DEFAULT can ONLY be seen within PACKAGE and SUBCLASS
	void add2() {
		
	}
	
	//PROTECTED can ONLY be seen within PACKAGE
	
	protected  void add23() {
		
	}
	
	//PRIVATE ONLY seen by the CLASS
	
	private void add4() {
		
	}
	
	//VARIABLES can Also use ACCES MODIFIERS
	
	public String name;  //public
	String phone;  //deafult
	private String SSN;  //Private
	protected String birhtday;  //Protected
	
}
