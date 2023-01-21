package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {
	public static void main(String[] args) {
		
		Set<String> courses = new HashSet<String>();
		courses.add("C");
		courses.add("C++");
		courses.add("Java");
		courses.add(".net");
		courses.add("Python");
		
		//enhanced for loop
		System.out.println("Using enhanced for loop:");
		for(String course: courses) {
			System.out.println(course);
		}
		
		//basic loop with iterator
		System.out.println("\nUsing basic loop with iterator: ");
		for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		//while loop with iterator
		System.out.println("\nUsing basic loop with iterator: ");
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
		
		//JAVA 8 forEach() with lambda
		System.out.println("\nUsing Java 8 with lambds: ");
		courses.forEach((course) -> System.out.println(course));
		
		//JAVA 8 STREAMING with forEach()
		System.out.println("\nUsing Java 8 streaming with forEach(): ");
		courses.stream().forEach((course) -> System.out.println(course));
		
	}

}
