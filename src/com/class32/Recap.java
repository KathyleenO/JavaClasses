package com.class32;

public class Recap {

	
	
	
	public static void main(String[] args) {
	
		//to store single value
		
		int num=10;
		
		//to store multiple values 
		
		int[] array= {10, 20, 30};
		
		int[] arrayList=new int [3];
		
		arrayList[0]=100;
		arrayList[1]=200;
		arrayList[2]=300;
		System.out.println(arrayList[2]); //print individually
		
		
		//Print all values with enhanced loop 
		for(int arr:arrayList) {
			System.out.print(arr+ " ");
		}
		System.out.println();
		System.out.println("-----Normal for Loops------");
		
		for(int i=0; i<arrayList.length; i++) {
			System.out.println(arrayList[i]);
		}
		
		//We can store non primitive types; Objects
		Fruit f= new Apple();
		Fruit f1=new Banana();
		Fruit f2=new Orange();
		
		Object monkey=new Monkey();
		
		//Storing objects of FRUIT CLASS
		Object [] fruitArray= {f, f1, f2};
		for(Object fr:fruitArray) {
			
		}
		
		
}
}
class Monkey{
	
}
class Fruit{
	
}
class Apple extends Fruit{
	
}
class Orange extends Fruit{
	
}
class Banana extends Fruit{
	
}




















