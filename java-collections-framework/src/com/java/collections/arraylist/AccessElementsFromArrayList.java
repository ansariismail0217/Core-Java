package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		
		List<String> topProgrammingLanguages = new ArrayList<String>();

		System.out.println("Is the list empty? "+ topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add(".net");
		
		System.out.println("Here are the top " + topProgrammingLanguages.size() 
		+ " programming languages in the world!");
		
		String bestProgrammingLanguage = topProgrammingLanguages.get(1);
		System.out.println("Best lang => " + bestProgrammingLanguage);
		
		// modifying the element at a given position
		topProgrammingLanguages.set(4, "C#");
		System.out.println("Modified element: "+topProgrammingLanguages.get(4));
		
	}

}
