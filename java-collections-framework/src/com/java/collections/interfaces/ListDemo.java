package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		
		// Initial size of the array is declared zero
		// but it dynamically increases its size to six 
		// according to the requirement
		List<String> list = new ArrayList<String>(0);
		list.add("element1");
		
		list.add("element2");
		list.add("element2");
		
		list.add("element3");
		
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		list.forEach((ele) -> {
			System.out.print(ele + " ");
		});
		System.out.println("\n"+list.get(0)+ "\n"+list.size());
		
	}

}
