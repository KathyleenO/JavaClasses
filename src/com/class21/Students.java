package com.class21;

public class Students {

	
	
	/*2. Create a Class called Students
● Create three variables studentName , studentID and numberOfStudents
● Create three objects of the Students Class
● Set the value for studentName , studentID and increment the numberOfStudents for each object
● Print out total number of students
	 * 
	 */
	
	public String studentName;
	public int studentId;
	public static int Numbers;
	
	void studentInfo() {
		System.out.println("Student Name "+studentName+ " student ID "  +studentId+ " how many students " +Numbers);
	}
	
	public static void main(String[] args) {
		
		
		
		Students obj=new Students();
		obj.studentName="Daniel";
		obj.studentId=27;
		Students.Numbers++;
		obj.studentInfo();
		
		Students obj2=new Students();		
		obj2.studentName="Nicole";
		obj2.studentId=30;
		Students.Numbers++;
		obj2.studentInfo();
		
		Students obj3=new Students();
		obj3.studentName="Katita";
		obj3.studentId=10;
		Students.Numbers++;
		obj3.studentInfo();
		
		System.out.println("total number of students is " +Students.Numbers);
		
		
	}
	
	
	
}
