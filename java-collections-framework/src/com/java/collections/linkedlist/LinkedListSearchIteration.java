package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteration {
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("dates");
		fruits.add("mango");
		fruits.add("grapes");
		System.out.println(fruits+"\n");
		
		//check occurence
		System.out.println("Is mango present in the list? "+fruits.contains("mango"));
		
		//find index of first occurence
		System.out.println("\nIndex of first occurence of mango: "+fruits.indexOf("mango"));
		
		//find index of last occurence
		System.out.println("Index of last occurence of mango: "+fruits.lastIndexOf("mango")+"\n");
		
		//java 8 iteration
		fruits.stream().forEach((ele) -> System.out.print(ele+" "));
		
		System.out.println("\n\nUsing iterator with while loop:");
		//iterator
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
	}

}
