package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArraylist {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Dates");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("pomegranate");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		
		System.out.println(fruits);
		
		fruits.remove(4);
		System.out.println("After removal: "+fruits);
		
		fruits.remove("mango");
		System.out.println("After removal: "+fruits);
		
		//demostrating removeAll() method
		List<String> subFruitList = new ArrayList<String>();
		subFruitList.add("pomegranate");
		subFruitList.add("grapes");
		
		fruits.removeAll(subFruitList);
		System.out.println("After removal: "+fruits);
		
		fruits.clear();
		System.out.println("After clearing all fruits: "+fruits);
		
	}

}
