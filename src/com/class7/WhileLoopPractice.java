package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		while(a<=20) {
			System.out.println(a);
		a++;
		}
		
		System.out.println("***********");
		
		// print values 50-20
		int b=50;
		
		while(b>=20) {
			System.out.println(b);
			b--;
		}
		
		// print all EVEN numbers 1 to 20
		
		int z=2;
		while (z<=20){
			System.out.println(z);
			z+=2;
		}
		System.out.println("*************");
	//or
	 
		int q=1;
	
	while(q<=20) {
	
	if (q%2==0) {
		System.out.println(q);
	}
	q++;  // make sure you put it OUTSIDE IF BUT INSIDE LOOP
	
	}
		System.out.println("*******");
		//PRINT only ODD numbers from 50 to 100
	
	int o=50;
	
	while(o<100) {
		if(o%2 !=0) {
			System.out.println(o);
		}
	o++;
	
	}
		
		//PRINT only EVEN numbers from 100 to 1
	
	int e=100;
	
       while (e>=1) {
		if(e%2==0) {
			System.out.println(e);
		}
		e--;
	}
		
	System.out.println("*******************");
       
       int i=0;
       
       while(i<=10){
        
         if(i==5 || i==7 || i==8 || i==9 ){
           continue;
          
         }
          i++;
      System.out.println(i); 
      
       }
         
       
       
		
		
		
	}

}
