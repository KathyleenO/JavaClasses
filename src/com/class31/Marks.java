package com.class31;

public abstract class Marks {

	
	abstract void getPercentage();
	
	
}
class A extends Marks{

	int sub1, sub2, sub3;
	
	A(int sub1, int sub2, int sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	@Override
	public void getPercentage() {
		System.out.println(sub1+sub2+sub3/3);
		
	}
	
}
class B extends Marks {

	int sub1, sub2, sub3, sub4;
	
	B(int sub1, int sub2, int sub3, int sub4){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	
	@Override
	public void getPercentage() {
		System.out.println(sub1+sub2+sub3+sub4/4);
		
	}

	
	
}


	

