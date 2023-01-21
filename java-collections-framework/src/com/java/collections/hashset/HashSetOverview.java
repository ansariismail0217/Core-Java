package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverview {
	public static void main(String[] args) {
		
		unorderedDemo();
		duplicateValueDemo();
		nullValueDemo();
		
	}

	//it is unordered
	private static void unorderedDemo() {

		Set<String> set = new HashSet<String>();
		set.add("element1");
		set.add("element2");
		set.add("element3");
		set.add("element4");
		set.add("element5");
		set.add("element6");
		set.add("element7");
		
		System.out.println("Unordered Demo:\n"+set);
		
	}

	//cannot contain duplicate values
	private static void duplicateValueDemo() {
		
		Set<String> set = new HashSet<String>();
		set.add("element1");
		set.add("element1");
		set.add(null);
		set.add(null);
		
		System.out.println("\nDuplicate Demo\n"+set);
		
	}

	//can contain null values
	private static void nullValueDemo() {
		
		Set<String> set = new HashSet<String>();
		set.add(null);
		set.add("element");
		
		System.out.println("\nNull Value Demo:\n"+set);
		
	}

}
