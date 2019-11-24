package com.class24;

public class TestPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child1  child1=new Child1();
		System.out.println(Child1.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		Parent parent=new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);
		parent.sing();
		
		//parent.code(); COMPILER ERROR AS PARENT CANNOT ACCES CHILD PROTPERTIES
		
		SecondChild child2=new SecondChild();
		System.out.println(SecondChild.race);
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.cook();
		child2.sing();
		
		
		
	}

}
