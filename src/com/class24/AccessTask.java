package com.class24;

public class AccessTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorsTask obj1=new ConstructorsTask(8, 9);      //PUBLIC
		ConstructorsTask obj2=new ConstructorsTask("HOnduras" ,"Tegu");  //DEAFULT
		//ConstructorsTask obj3=new ConstructorsTask(); ///PRIVATE CANT ACCESS 
		ConstructorsTask obj4=new ConstructorsTask(9);  //PROTECTED
		
		
	}

}
