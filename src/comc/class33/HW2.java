package comc.class33;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW2 {

	

	public static void main(String[] args) {
		/* Create an arrayList of words. 
		 * Remove every word that ends with “e”. Use iterator
		 */	
		
		
		ArrayList<String>words=new ArrayList<>();
		words.add("I");
		words.add("love");
		words.add("Erick");
		words.add("lopez");
		words.add("some");
		words.add("tomate");
		
		
		Iterator<String>print=words.iterator();
		while(print.hasNext()) {
			;
			if(print.next().endsWith("e")) {
				print.remove();
			}
		}
		System.out.println(words);
		
		
		
//		List<String>list=new ArrayList<>();
//		list.add("Cute");
//		list.add("Love");
//		list.add("Hello");
//		list.add("Java");
//		
//		Iterator<String> it=list.iterator();
//		
//		while(it.hasNext()) {
//			if(it.next().endsWith("e")) {
//				it.remove();
//			}
//		}
//		System.out.println(list);
	}
}
	
