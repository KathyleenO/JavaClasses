package com.class27;

public class FinalKeyword {

	public static final String str="Hello";
	
	public final void hello() {
		System.out.println(" I am a final method in parent class");
	}

	
	
	public static void main(String[] args) {
		
		
		String str="I am awesome";
		str="I am cool";   //CAN RENAME OR CHANGE VALUE 
		System.out.println(str);
		
		final String finalString="Java is easy";
		//finalString="Java is hard"; CANNOT CHANGE BC U ADDED final keyword, compiler error
		
		
	}
	
	class FinalKeywordChild extends FinalKeyword{
		//FINAL methods CANNOT BE OVERIDEN , we will get COmpiler error
//		public final void hello() {
//			System.out.println();
//		}
		
		public final void hello(String str) {
			System.out.println(" I am a final method in parent class");
		}
		
	}
	

}
