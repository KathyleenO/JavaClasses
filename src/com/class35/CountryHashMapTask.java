package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountryHashMapTask {

	public static void main(String[] args) {
		Map<String, String> countries=new TreeMap<>();
		
		countries.put("Honduras", "Tegucigalpa");
		countries.put("El Salvador", "San Salvador");
		countries.put("Spain", " Spana");
		countries.put("Brazil", "Rio Janeiro");
        System.out.println(countries);//alphabtical order using TreeMap
        
        System.out.println("COUNTRIES--ENHANCE LOOP");
        
        Set<String> setprintKeys=countries.keySet();
        for(String countrykeys:setprintKeys) {
        	System.out.println(countrykeys);	
        }
		System.out.println("==Iterator Keys====");
            Iterator<String> iteratorkeys=setprintKeys.iterator();
            while(iteratorkeys.hasNext()) {
            	System.out.println(iteratorkeys.next());
            }
            
            System.out.println("=====for loop Values====");
            
            Collection<String> collectionPrintValues=countries.values();
            
            for(String printValues:collectionPrintValues) {
            	System.out.println(printValues);
            }
            
            System.out.println("====ITERATOR VAlues==== ");
            
            Iterator<String> iteratorval=collectionPrintValues.iterator();
            while(iteratorval.hasNext()){
            	System.out.println(iteratorval.next());
            }
            
            System.out.println("=====Print BOTH key+values=====");
            
            Iterator<String> iteratorkeysS=setprintKeys.iterator();
            while(iteratorkeysS.hasNext()) {
            	String newkeys=iteratorkeysS.next();
            	String newValues=countries.get(newkeys);
            	System.out.println(newkeys+ ":" +newValues);
            }
            
	}

}
