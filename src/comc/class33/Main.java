package comc.class33;

class Main implements MyInterface{
	public static void main(String[] args) {
		
		Main obj=new Main();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
	}
}
interface MyInterface{
	
	
	int a =100;
	  final int b=200;
	  static int c=300;
}

