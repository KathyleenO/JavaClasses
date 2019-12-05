package com.class27;

public class AccessModifiersStudents {

	public void study() {
		System.out.println("Student needs  to study");
	}

	private void doHomework() {
		System.out.println("Student needs  to do homework");
	}

	protected void research() {
		System.out.println("Student needs  to do research");
	}

	void attendClasses() {
		System.out.println("Student needs  to do attend classes");
	}
}

class SyntaxStudent extends Student {
	//@Override is not overiden new method
	public void doHomework() {
		System.out.println("Student needs  to do homework");
	}
	

	public void study() {
		System.out.println("Syntax Student need to study a lot");
	}
	
	public void research() {
		System.out.println("Syntax Student needs  to do a lot of research");
	}
	
	protected void attendClasses() {
		System.out.println("Syntax Student needs  to do ALL attend classes");
	}
	
	
}
