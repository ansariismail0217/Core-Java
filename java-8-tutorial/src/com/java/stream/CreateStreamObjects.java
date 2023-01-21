package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {
	public static void main(String[] args) {
		
		//create a stream
		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach(System.out::println);
		
		//create stream from sources
		Collection<String> collection = Arrays.asList("C", "Java", "Python", "C++", "Javascript");
		collection.stream().forEach(System.out::println);
		
		System.out.println("\nList: ");
		List<String> list = Arrays.asList("C", "Java", "Python", "C++", "Javascript");
		list.stream().forEach(System.out::println);
		
		System.out.println("\nSet: ");
		Set<String> set = new HashSet<String>(list);
		set.stream().forEach(System.out::println);
		
		//creating stream of arrays
		System.out.println("\nArrays: ");
		int[] arr = {1,2,3,4,5};
		Arrays.stream(arr).forEach(System.out::println);
		
	}
}
