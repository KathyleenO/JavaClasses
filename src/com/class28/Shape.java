package com.class28;

public class Shape {
  double radius;
  double c;
	
  Shape(double radius, double c){
	this.radius=radius;
	this.c=c;
	}
	
//	double c= 2*3.14;
//	double radius=c/2*3.14;
}
class Circle extends Shape{

	double a;
	Circle(double radius, double c) {
		super(radius, c);
		this.a=a;
	}

	public void areaCircle() {
		
		System.out.println(a=3.13*radius*2);
		
	}
	
	void printmethod(){
		
		System.out.println(c= 2*3.14);
		System.out.println(c/2*3.14);
		
	}
	
}
