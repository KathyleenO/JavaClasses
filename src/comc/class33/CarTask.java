package comc.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class CarTask {

	public static void main(String[] args) {
		
		ArrayList<String>cars=new ArrayList<>();
		
		cars.add("BM");
		cars.add("Mustang");
		cars.add("Classic");
		
		//RETRIVE
		
		System.out.println("***First way***");
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("***Second Way***");
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("*** Third way*** ");
		Iterator it=cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
