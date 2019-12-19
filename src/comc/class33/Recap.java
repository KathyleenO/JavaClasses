package comc.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		
//create array list to store numbers
		
		
		ArrayList <Integer> number=new ArrayList<>();
		number.add(1);
		number.add(10);
		number.add(100);
		number.add(1000);
		
		//SIZE OF ARRAY 
		int size=number.size(); //4
		System.out.println(size);

		//ADD MORE
		number.add(10000);
		
		//TO REMOVE
		
		number.remove(size-1);//3
		number.remove(1);
		System.out.println(number);
		
		//retrive values from arraylist
		
		int element=number.get(0);
		
		//1. for loop
		
		for(int i=0; i<number.size(); i++) {
			System.out.println(number.get(i));
		}
		//2. enhanced loop
		
		for( Integer num:number) {
			System.out.println(num);
		}
		
		System.out.println("Backwords Numbers");
		
		//3. backwords
		for(int i=number.size()-1; i>=0; i--) {
			System.out.println(number.get(i));
		}
		System.out.println("------iterator-----");
		//4 using Iterator 
		Iterator<Integer>iterator=number.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//or can do other operations
//			int numbers=iterator.next();
//			if(numbers%2==0) {
//				System.out.println(numbers);
			//}
			
		}
	}

}
