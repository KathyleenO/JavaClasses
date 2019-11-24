package com.class22;

public class RepsAccesModifiers {

	
	
	
	        private void m1(){
		    System.out.println("This is Private Method");
		  }
		  
		  void m2(){
		   System.out.println("This is Default Method");
		  }
		  protected void m3(){
		      System.out.println("This is Protected Method");
		  }
		  public void m4(){
		    System.out.println("This is Public Method");
		  }
		 
		    
		  private int a=100;
		  protected String name="SyntaxSolutions";
		  float salary=565656.09f;
		  public String city="Florida";

  
		    
		  private int batch=3;
		  private String name1="SyntaxSolutions";
		  
		  private void print1(){
		    System.out.println(batch+" " +name);
		  }
		  
	
	
	 private String  m5(){
			  String result="private";
			  return result;
			}
	
	 String m6() {
		//System.out.println("default");
		String result="default";
		return result;
	}
	
	protected String m7() {
		//System.out.println("protected");
		String result="protected";
		return result;
	}
	
	public String m8() {
		//System.out.println("public");
		String result="public";
		return result;
	}
	
	protected int num1=222;
	
	protected void m9 () {
		System.out.println(num1);
	}
	
	
	int batch1=3;
	String InstituteName="SyntaxSolutions";
	int year=2019;
	
	String  student="john";
	 void num(){
		    int batch=3;
		    System.out.println(batch);
		  }
	
	 int intValue;
	  double doubleValue;
	  char charValue;
	 
	 
	  int intNumber;
	  
	  
	  
	 
	public static void main(String[] args) {
	
 RepsAccesModifiers   obj=new RepsAccesModifiers();
			int battch4=3;
//		  obj.m1();
//		  obj.m2();
//		  obj.m3();
//		  obj.m4();
//		  
//		  
//		  System.out.println(obj.a);
//		  System.out.println(obj.name);
//		  System.out.println(obj.salary);
//		  System.out.println(obj.city);
		
			
			int intNumber=obj.intNumber=200;
		  System.out.println(intNumber +200);
		 
		 System.out.println(obj.m5());
	   	System.out.println(obj.m6());
		  System.out.println(obj.m7());
		  System.out.println(obj.m8());
		  
		  
		  
		  System.out.println(obj.batch1);
		  System.out.println(obj.InstituteName);
		  System.out.println(obj.year);
		  
		  System.out.println(obj.student);
		   obj.num();
		
		int print1=obj.intValue=10;
		System.out.println(print1);
		
		  
	}

}
