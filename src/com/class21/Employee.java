package com.class21;

public class Employee {
	/*
	 * 1. CreateaClasscalledEmployee: ● Create three variables eID , salary and set
	 * the CEO to “Sumair” ● Create two objects of the class Employee ● Set the
	 * value of eID, salary for each of the objects ● Print out the eID , salary and
	 * CEO for each of the objects
	 * 
	 * 
	 * 
	 */

	String eID;
	String salary;
	static String CEO;

	void displayInfor() {

		System.out.println("Employees ID" + eID + " his salary is " + salary + "The CEO is " + CEO);
	}

	public static void main(String[] args) {

		Employee.CEO = "Samair";

		Employee obj = new Employee();

		obj.eID = "Erick";
		obj.salary = "$150,000";
		Employee.CEO = "Samair";
		obj.displayInfor();

		Employee obj2 = new Employee();

		obj2.eID = "Kathleen";
		obj2.salary = "200,000";

		obj2.displayInfor();

	}

}
