package com.class25;

public class Test  {

	public static void main(String[] args) {
		// TODO Auo-generated method stub

		System.out.println("creating an object of a Employee");
		
		
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object of a ");
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.artifact="Sprint BAcklogs";
	
		
	}
	
	

}
