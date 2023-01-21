package com.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		
		//ascending order
		System.out.println("Ascending order:");
		//method 1: without lambda
		List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).
						collect(Collectors.toList());
		System.out.println(sortedList);
		
		//method 2: with lambda
		List<String> sortedList1 = fruits.stream().sorted((o1, o2) -> 
							o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedList1);
		
		List<String> sortedList2 = fruits.stream().sorted()
							.collect(Collectors.toList());
		System.out.println(sortedList2);
		
		//descending order
		System.out.println("\nDescending order:");
		//method 1: without lambda
		List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).
						collect(Collectors.toList());
		System.out.println(sortedList3);
		
		//method 2: with lambda
		List<String> sortedList4 = fruits.stream().sorted((o1, o2) -> 
							o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedList4);
		
		//sorting product object
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Macbook Air", 120000));
		products.add(new Product(2, "Wipro T-Shirt", 1200));
		products.add(new Product(3, "Boat Rockerz 400", 1500));
		products.add(new Product(4, "STM Laptop Bag", 3000));
		products.add(new Product(5, "Campus Air Shoes", 1800));
		
//		List<Product> sortedProducts = products.stream().sorted(new Comparator<Product>() {
//
//			@Override
//			public int compare(Product o1, Product o2) {
//				return (int) (o1.getPrice() - o2.getPrice());
//			}
//		}).collect(Collectors.toList());
		
		//using lambda expression
		//for descending order sorting, swap the reference
//		List<Product> sortedProducts = products.stream()
//				.sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
//						.collect(Collectors.toList());
		
		//using method reference
//		List<Product> sortedProducts = products.stream()
//				.sorted(Comparator.comparing(Product::getPrice))
//						.collect(Collectors.toList());
		
		//using method reference to sort in descending order
		List<Product> sortedProducts = products.stream()
				.sorted(Comparator.comparing(Product::getPrice).reversed())
						.collect(Collectors.toList());
		
		System.out.println("\nSorted products by price: ");
		sortedProducts.forEach(System.out::println);
		
	}

}
