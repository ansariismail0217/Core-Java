package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkedListElements {
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("dates");
		fruits.add("watermelon");
		
		//getting first and last element
		System.out.printf("First element: %s\nLast element: %s",
				fruits.getFirst(), fruits.getLast());
		
		//getting element from a given index
		System.out.printf("\nElement at second position is: %s\n\n", 
				fruits.get(1));
		
		//looping 
		fruits.stream().forEach((ele) -> System.out.println(ele));
		
		
	}

}
