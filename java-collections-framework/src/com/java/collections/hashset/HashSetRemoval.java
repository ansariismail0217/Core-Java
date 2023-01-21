package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoval {
	public static void main(String[] args) {
		Set<Integer> firstFiveEvenNumbers = new HashSet<Integer>();
		firstFiveEvenNumbers.add(2);
		firstFiveEvenNumbers.add(4);
		firstFiveEvenNumbers.add(6);
		firstFiveEvenNumbers.add(8);
		firstFiveEvenNumbers.add(10);
		
		// removing an object
		firstFiveEvenNumbers.remove(2);
		System.out.println("Using remove(): "+firstFiveEvenNumbers);
		
		// removeAll
		Set<Integer> evenNumbers = new HashSet<Integer>();
		evenNumbers.add(4);
		evenNumbers.add(6);
		
		firstFiveEvenNumbers.removeAll(evenNumbers);
		System.out.println("\nUsing removeAll(): "+firstFiveEvenNumbers);
		
		// clear set using slear()
		firstFiveEvenNumbers.clear();
		System.out.println("\nUsing clear(): "+firstFiveEvenNumbers);
		
	}

}
