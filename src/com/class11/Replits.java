package com.class11;

import java.util.Scanner;

public class Replits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		double[][] a = {
//				{1.4,2.0,3.3,2},
//				{4,1.5,6.1,1},
//				{1.2,3.1,4,1.6}
//			};
//			
//			for(int i=0; i<a.length; i++){
//			 for(int j=0; j<a[i].length; j++) {
//				 System.out.print(a[i][j] *2 +" ");
//			 }
//			 
//			 System.out.println();
//			}
		
		int rowTotal=0;
			int[][] b = {
					{5,2,3,7},
					{1,5,2,2},
					{1,2,3,4}
				};
				
			for (int s = 0; s < b.length; s++) {
				rowTotal=rowTotal+b[0][s];
			}
			
			System.out.println(rowTotal);
			

		         
//			int[][] a = {
//					{5,2,3,7},
//					{1,5,1,1},
//					{8,3,1,2}
//				};  
//		     
//			
//			int largest=a[0][0];
//			for(int i=0; i<a.length; i++) {
//				for(int j=0; j<a[i].length; j++) {
//					if(a[i][j]>largest) {
//						largest=a[i][j];
//					}
//					
//				}
//				
//			}
//		
//			System.out.println("largest number is " + largest);
//			
//			
			
//			int[][] d = {
//					{1,1,1},
//					{1,1,1},
//					{1,1,1}
//				};
//			
//
//					if(d.length==d[0].length) {
//						System.out.println("true");
//					}else {
//						System.out.println("false");
//					}
//				
//			
			
			
					int[][] a = {
							{-5,-2,-3,7},
							{1,-5,-2,2},
							{1,-2,3,-4}
						};

//				int sum1=0;
//				for(int i=0; i<a.length; i++){
//				  for(int j=0; j<a[i].length; j++){
//				    if(a[i][j]<1 && a[i][j]%2!=0){
//				    sum1=a[i][j]+a[i][j+a[i][j]];
//					  //System.out.println(sum1);
//				    
//				  }
//				}	
//				  System.out.println(sum1);
//			
//				}		
//				
			
			
				int rowSum=0;
				int row=0;
				int sum=0;
				int rowSum2=0;
				
				int[][] f = {
					{1,1,2}, //sum = 4
					{3,1,2}, //sum = 6
					{3,5,3}, //sum = 11
					{0,1,2}  //sum = 3
				};
				
				for(int i=0; i<f.length; i++){
					for(int j=0; j<f[i].length; j++) {
				  rowSum+=f[0][j];
				  row+=f[1][j];
				  sum+=f[2][j];
			  rowSum2+=f[3][j];
				}
				}	
			
			System.out.println(rowSum);
			System.out.println(row);
			System.out.println(sum);
			System.out.println(rowSum2);
			
			
			
			int[][] g = {
					{-5,-2,-3,7},
					{1,-5,-2, 2},
					{1,-2, 3,-4}
				};
				
				
		//   should print -9
			int sumColum=0;
			for(int i=0; i<g.length; i++){
			  sumColum+=g[i][1];
			}
			
			
			System.out.println(sumColum);
			System.out.println("******************");
//			 String str = "abracadabra alakazam";
//			    String target1 = "dab";
//			    String target2 = "ABRA";
//			    
//			System.out.println(str.indexOf('c'));
//			System.out.println(str.indexOf(" "));
//			System.out.println(str.indexOf(target1));
//			System.out.println(str.indexOf(target2));
//			
			
			 String str = "laptops out for harambe";
			  // System.out.println(str.); 	
			
			System.out.println(str.length());
		
			
			System.out.println(str.substring(5));
			System.out.println(str.substring(7, 10));
			System.out.println(str.substring(16));
			char let1=str.charAt(3);
			char let2=str.charAt(12);
			
			System.out.println("" + let1+let2);
			
		
			String str1 = "boopity bop";
	
			System.out.print(str.charAt(5));
			System.out.print(str.charAt(8));
			System.out.print(str.charAt(1));
			System.out.print(str.charAt(10));
			
		
			
			
//			 Scanner scan=new Scanner(System.in);
//			    System.out.println("Input String value");
//			    String word=scan.nextLine();
//			    
//			  	System.out.println(word.substring(0,3));
//	
			
			
			
			
			
			 Scanner sc = new Scanner(System.in); 
			  System.out.println("Enter any programming language");
			   String language = sc.nextLine(); 
			  
			  String print;
			  switch(language){
			    
			    case "Java":
			    print="Java is a programming language";
			    break;
			    case "C":
			      print="C is a procedural programming langauge";
			      break;
			      case "C++":
			        print="C++ is a middle-level pragramming language";
			        break;
			        default:
			        	
			        print="Doesnt match any programming language";
			  }
			  
			
			System.out.println(print);
			
			
			
			
			
			
			
			
	}

}
