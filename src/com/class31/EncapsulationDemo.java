package com.class31;

class Mainss{
	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpName("John");
		String str=obj.getEmpName();
		obj.setempAge(30);
		System.out.println(str);
		
		obj.setempAge(30);
		Integer num=obj.getempAge();
		System.out.println(num);
	}
	
}
public class EncapsulationDemo {

	private String empName;
	
	public void setEmpName(String empName) {
	this.empName=empName;
		System.out.println("Employee Name:" +empName);
	}
	
	public String getEmpName() {
		return empName;
	}
	
	
	private int empAge;
	
	public int getempAge() {
		return empAge;
	}
	
	public void setempAge(int empAge) {
		this.empAge=empAge;
		System.out.println("Employee Age:");
		
	}
	
}

