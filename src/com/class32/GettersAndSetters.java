package com.class32;

public class GettersAndSetters {


public static void main(String [] args){
EncapsulationDemo obj=new EncapsulationDemo();
System.out.println(obj.getempName());
System.out.println(obj.getempAge());
}
}
class EncapsulationDemo{
  
  private String empName="John";
  private int empAge=30;
 
 public String getempName(){
   return empName;
 }
   public int getempAge(){
     return empAge;
   }
   
 
 
}
class Maint {
	  public static void main(String [] args){


	EncapsulationDemos obj1=new EncapsulationDemos();
		   obj1.setEmpNames("John");
			String str=obj1.getEmpNames();
			obj1.setempAges(30);
			System.out.println(str);
			
			obj1.setempAges(30);
			Integer num=obj1.getempAges();
			System.out.println(num);
	}

	}


class EncapsulationDemos{
	
private String empNames;

public void setEmpNames(String empNames) {
this.empNames=empNames;
	
}

public String getEmpNames() {
	return"Employee Name: " +empNames;
}


private int empAges;

public int getempAges() {
		return empAges;
}

public void setempAges(int empAges) {
	this.empAges=empAges;
	
	
}

}

class Account{
	  private long acc_no;  
	private String name, email;  
	private double amount; 

	public void setAccNo(long acc_no){
	  this.acc_no=acc_no;
	}
	public void setName(String name){
	  this.name=name;
	}
	public void setEmail(String email){
	  this.email=email;
	}
	public void setAmount(double amount){
	  this.amount=amount;
	}

	public long getAccNo(){
	  return acc_no;
	}
	public String getName(){
	  return name;
	}
	public String getEmail(){
	  return email;
	}
	public double getAmount(){
	  return amount;
	}





	}

class Print {

public static void main(String [] args){
  
  Account obj=new Account();
  obj.setAccNo(7560504000l);
  obj.setName("Sumair");
  obj.setEmail("sumair@syntaxsolutions.com");
  obj.setAmount(50000.0);
  
  System.out.print(obj.getAccNo());
   System.out.print(obj.getName());
    System.out.print(obj.getEmail());
     System.out.print(obj.getAmount());
  
}


}