import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		
	LinkedList<String>llist=new LinkedList<>();
           
	//adding Element
	
	        llist.add("Hello");
	        llist.add("Bye");
	        llist.add("Hola");
	        llist.add("Adios");
	        llist.add(2, "How are you?");
	        System.out.println(llist);
	        
	        //replace 1 element
	        llist.set(1, "Good Bye");
	        System.out.println(llist);
	        
	        //retrive 1 element
	        String element=llist.get(2);
	        System.out.println(element);
	        
	        //retrive all elements
	        //1st way 
	        System.out.println("------FOR LOOP-------");
	        for(int i=0; i<llist.size(); i++) {
	        	System.out.println(llist.get(i));
	        	
	        }
	        System.out.println("===ENHANCED LOOP------");
	        
	        for(String str:llist) {
	        	System.out.println(str);
	        }
	        System.out.println("-----Iterato=====r");
	    
	        Iterator<String> it=llist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	        
	        
	}

}
