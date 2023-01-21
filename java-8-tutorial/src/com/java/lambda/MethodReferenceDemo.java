package com.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

public class MethodReferenceDemo {
	
	public static int addition(int a, int b) {
		return a+b;
	}
	
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		
		// 1. Method reference to a static method
		
		System.out.println("--Built in functional interfaces--");
		//Using lambda
		Function<Integer, Double> functionLambda = (input) -> Math.sqrt(input);
		System.out.println("Using lambda: "+ functionLambda.apply(25));
		
		//using method reference
		Function<Integer, Double> functionMethodRef = Math::sqrt;
		System.out.println("Using method reference: "+ functionMethodRef.apply(25));
		
		
		System.out.println("\n--Static methods of a class--");
		//Using lambda
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a, b);
		System.out.println("Using lambda: "+ biFunctionLambda.apply(10, 20));
		
		//using method refereces
		BiFunction<Integer, Integer, Integer> biFunctionMethodRef = MethodReferenceDemo::addition;
		System.out.println("Using method reference: "+ biFunctionMethodRef.apply(10, 20));
		
		// 2. Method reference to an instance method of an object
		System.out.println("\n--Method reference to an instance method of an object--");
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		//using lambda expression
		Printable printableLambda = (msg) -> methodReferenceDemo.display(msg);
		System.out.print("Using lambda: ");
		printableLambda.print("Hello World");
		
		//using method reference
		Printable printableMethodRef = methodReferenceDemo::display;
		System.out.print("Using method reference: ");
		printableMethodRef.print("Hello World");
		
		// 3. Reference to the instance method of an arbitrary object
		System.out.println("\n--Reference to the instance method of an arbitrary object--");
		// Sometimes, we call a method of an argument in the lambda expression
		Function<String, String> stringLambda = (input) -> input.toLowerCase();
		System.out.println("Using lambda: "+ stringLambda.apply("This is JAVA!"));
		
		//using method reference
		Function<String, String> stringMethodReference = String::toLowerCase;
		System.out.println("Using mehtod reference: "+ stringMethodReference
				.apply("This is JAVA!"));
		
		//exapmle 2
		String[] arr = {"A","E","I", "O", "U", "a", "e", "i", "o", "u"};
		
		//using lambda expression
		Arrays.sort(arr, (s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println("\nUsing lambda: "+arr);
		
		//using method reference
		Arrays.sort(arr, String::compareToIgnoreCase);
		System.out.println("Using method reference: "+arr);
		
		// 4. Reference to a constructor
		System.out.println("\n--Reference to a constructor--");
		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Melon");
		fruits.add("Melon");
		System.out.println("Initial list: "+fruits);
		
		//using lambda
		Function<List<String>, Set<String>> setLambda = (fruitsList) -> new HashSet<String>(fruits);
		System.out.println("Set using lambda: "+setLambda.apply(fruits));
		
		//using method reference
		Function<List<String>, Set<String>> setMethodRef = HashSet<String>::new;
		System.out.println("Set using method reference: "+ setMethodRef.apply(fruits));
		
	}

}
