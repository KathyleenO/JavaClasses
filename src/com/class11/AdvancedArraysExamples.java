package com.class11;

public class AdvancedArraysExamples {

	public static void main(String[] args) {
		// create a array of names and retrive all values
		
		// create array using new keyboard
		
		String[] names=new String[7];
		
           names[0]="asel";
            names[1]="Awet";		
           names[2]="arif";
            names[3]="weqas";	
            names[4]="dzmitri";
            names[5]="shiva";   
            names[6]="Sandes";
            for(int i=0; i<names.length; i++) {
            	System.out.println(names[i]);
            }

//create an array Using literal


String[] students= {"Shaban", "Bilal", "mehet" , "Zaki","Samir", "Frank"};
for(int i=0; i<students.length-1; i++) {     /// index 0-5  if you put lenght-1=5 if NO -1 error
	System.out.println(students[i]);
}


System.out.println("********************");
//Advaced for loop, for each loop or  Only used for Array or Collecgtion 


for(String st:students) {
	System.out.println(st);  //datatype anyvariable name: array variable
}








		
	}

}
