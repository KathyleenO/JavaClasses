package com.class23;

public class Students {
	/*Write a java program of Class Students that takes students name and 
	3 subject grades. Inside your class also have a method to Calculate Average Grade. 
	Test Student class for 5 different students with different marks. 
	Your program should print an average mark of each students name.
	NOTE: please use different names for instance and local variables.
	  */
	
	String name;
	int sub1;
	int sub2;
	int sub3;
	
	Students(String name1, int grade1, int grade2, int grade3){
     	name=name1;
		sub1=grade1;
		sub2=grade2;
		sub3=grade3;
	}
	public void averageGrade() {
		int avg=sub1+sub2+sub3/3;
		System.out.println("Average grade for Student " +name+ " is " +avg);
	}
	public static void main(String[] args) {
		
		Students std1=new Students("John", 80, 79, 87);
		std1.averageGrade();
		Students std2=new Students("Erick", 70, 99, 100);
		std2.averageGrade();
		Students std3=new Students("Kathy", 100, 101, 105);
		std3.averageGrade();
		Students std4=new Students("Nicole", 60, 80, 50);
		std4.averageGrade();
		Students std5=new Students("Lopez", 70, 80, 90);
		std5.averageGrade();
	}
	
	
}
