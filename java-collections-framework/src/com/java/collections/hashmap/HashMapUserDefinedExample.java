package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
	public static void main(String[] args) {
		
		Map<Integer, Student> studentMap  = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("Abdullah", "Ansari"));
		studentMap.put(2, new Student("Faiz", "Ansari"));
		studentMap.put(3, new Student("Yunus", "Ansari"));
		
		System.out.println(studentMap.values());
		
	}

}
