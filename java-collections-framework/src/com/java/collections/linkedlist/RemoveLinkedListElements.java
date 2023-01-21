package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RemoveLinkedListElements {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("dates");
		fruits.add(null);
		fruits.add("banana");
		
		System.out.println("Initial Linked List: "+ fruits);
		
		//removing the first element
		System.out.printf("Removing the first element => %s", fruits.removeFirst());
		
		System.out.println("\n\nAfter removal :\n"+fruits);
		
		//removing the last element
		System.out.printf("\nRemoving the last element => %s", fruits.removeLast());
				
		System.out.println("\nAfter removal :\n"+fruits);
		
		//removing by index
		fruits.remove(3);
		System.out.println("\nRemoving by index:\n"+fruits);
		
		//removing by object
		fruits.remove("mango");
		System.out.println("\nRemoving by object:\n"+fruits);
		
		//clearing the list
		fruits.clear();
		System.out.println("\nAfter clearing the list:\n"+fruits);
		
	}

}
