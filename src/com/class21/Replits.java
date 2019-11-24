package com.class21;

public class Replits {

	static int count=0;
	  public void incre(){
	    count++;
	  }
	  public static void main(String[] args) {
		  Replits obj1 = new Replits();
		  Replits obj2 = new Replits();
	    Replits obj3 = new Replits();
	    obj1.incre();
	    obj2.incre();
	    obj3.incre();
	  System.out.println(obj1.count);
	  System.out.println(obj2.count);
	  System.out.println(obj3.count);
	  }
	}
	
	
	
	

