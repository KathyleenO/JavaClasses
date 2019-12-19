package com.class32;

public class Person {

		  private String firstname;
		  private String lastname;
		  private int birthmonth;
		  private int birthday;
		  private int birthyear;
		  private String ssn;
		  
		  
		  
		  Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn){
		    this.firstname=firstname;
		    this.lastname=lastname;
		    this.birthmonth=birthmonth;
		    this.birthday=birthday;
		    this.birthyear=birthyear;
		    this.ssn=ssn;
		  }
		  public String getfirstname(){
		    return firstname;
		  }  
		    
		  public String getlastname(){
		    return lastname;
		  }   
		    public int getbirthmonth(){
		    return birthmonth;
		  }  
		    public int getbirthday(){
		    return birthday;
		  }  
		    public int getBirthYear(){
		    return birthyear;
		  }  
		    public String getSocialS() {
		    	return ssn;
		    }
		 
		  
		  public void setfirstname(String firstname){
		    this.firstname=firstname;
		  
		  }
		  public void setlastname(String lastname){
		    this.lastname=lastname;
		    
		  }
		  public void setbirthmonth(int birthmonth){
		    this.birthmonth=birthmonth;
		  }
		  public void setbirthday(int birthday){
		    this.birthday=birthday;
		  }
		  public void setbirthyear(int birthyear){
		    this.birthyear=birthyear;
		  }
		  public void setsocial(String ssn){
		    this.ssn=ssn;
		  }
		  
		  public void formatBirthday(String birthmonth, String birthday, String birthyear){
		    System.out.println(birthmonth+"/"+ birthday+"/"+ birthyear);
			  
		  }
		  
		}
