package com.class21;

public class School {

	public static void main(String[] args) {
		
		
          Student.school="Morning School";  //.school varibale belongs to CLASS so you can access without creating an object
	

	
		Student  student1=new Student();
		
		student1.studentName="Erick";
		student1.GPA=3.95;
		student1.school="syntax";
		
		Student student2=new Student();
		student2.studentName="Jaime";
		student2.GPA=3.90;
		student2.school="syntax techonologies";
		
		student1.displayInfo();
		student2.displayInfo();
		
		student1.study(3);
		
	
		Student student0=new Student();
		student0.displayInfo();
		
}

}
