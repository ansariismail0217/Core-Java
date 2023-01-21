package com.java.collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateThroughList {
	
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");
		
		// basic
		for(int i=0; i<courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		
		// enhanced
		for(String course: courses) {
			System.out.println(course);
		}
		
		// basic with iterator
		for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = iterator.next();
			System.out.println(course);
		}
		
		// while with iterator
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
		}
		
		System.out.println("\nJAVA 8\n");
		
		// JAVA 8 + STREAM + LAMBDA EXAMPLE
		courses.stream().forEach(course -> System.out.println(course));
		
		// JAVA 8 + LAMBDA
		courses.forEach(course -> System.out.println(course));
		
	}

}
