package com.java.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListBasics {
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		
		System.out.println(fruits);
		
		// add(index, element)
		fruits.add(2, "orange");
		System.out.println("\nAfter adding a new element at given position:");
		
		System.out.println(fruits);
		
		// adding in the beginning
		fruits.addFirst("dates");
		
		// adding in the last
		fruits.addLast("grapes");
		
		System.out.println("\nAfter adding elements in the first and last positions:\n"+fruits);
		
	}

}
