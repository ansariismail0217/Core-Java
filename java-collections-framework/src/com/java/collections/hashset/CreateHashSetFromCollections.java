package com.java.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollections {
	public static void main(String[] args) {
		
		//Set<Integer> firstFiveEvenNumbers = new HashSet<Integer>();
		List<Integer> firstFiveEvenNumbers = new ArrayList<Integer>();
		firstFiveEvenNumbers.add(2);
		firstFiveEvenNumbers.add(4);
		firstFiveEvenNumbers.add(6);
		firstFiveEvenNumbers.add(8);
		firstFiveEvenNumbers.add(10);
		
		//Adding list to a Set
		Set<Integer> firstTenEvenNumbers = new HashSet<Integer>(firstFiveEvenNumbers);
		System.out.println(firstTenEvenNumbers);
		
		//Set<Integer> nextFiveEvenNumbers = new HashSet<Integer>();
		List<Integer> nextFiveEvenNumbers = new ArrayList<Integer>();
		nextFiveEvenNumbers.add(12);
		nextFiveEvenNumbers.add(14);
		nextFiveEvenNumbers.add(16);
		nextFiveEvenNumbers.add(18);
		nextFiveEvenNumbers.add(20);
		
		//Adding List collection to a Set, which is constructed using Hashmap
		firstTenEvenNumbers.addAll(nextFiveEvenNumbers);
		System.out.println(firstTenEvenNumbers);
		
		
	}

}
