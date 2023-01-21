package com.java.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
	public static void main(String[] args) {
		
		Map<String, Integer> numberMapping = new HashMap<>();
		
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		
		//cannot contain duplicate values
		numberMapping.put(null, null);
		numberMapping.put(null, 5);
		
		System.out.println(numberMapping);
		
		//check if empty
		System.out.println("\nIs empty? "+numberMapping.isEmpty());
		
		//check size
		System.out.println("\nSize? "+numberMapping.size());
		
		//check if key exist
		if(numberMapping.containsKey("Three"))
			System.out.println("\nExists");
		else
			System.out.println("\nDoes not esist");
		
		//check if key exist
		if(numberMapping.containsValue(4))
			System.out.println("\nExists");
		else
			System.out.println("\nDoes not esist");
		
		//get value by key
		System.out.println("\nValue of \"One\": "+numberMapping.get("One"));
		
		//removing key
		numberMapping.remove("One");
		System.out.println("\nAfter removing key \"One\"\t"+numberMapping);
		
		//returning a set of keys only
		Set<String> keys = numberMapping.keySet();
		System.out.println("\nSet of keys: "+keys);
		
		//returning a collection of values only
		Collection<Integer> values = numberMapping.values();
		System.out.println("\nCollection of values: "+values+"\n");
		
		//iterating using for each loop
		for(Map.Entry<String, Integer> entry: numberMapping.entrySet()) {
			System.out.println("Key => "+entry.getKey()+", value => "+entry.getValue());
		}
		
		//usng iterator
		System.out.println("\nIterating using iterator with while loop:");
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key => "+entry.getKey() + ", value => "+entry.getValue());
			
		}
		
		//java 8 forEach
		System.out.println("\nJava 8 forEach:");
		numberMapping.forEach((K,V) -> {
			System.out.println("K > "+K);
			System.out.println("V > "+V);
		});
		
	}

}
