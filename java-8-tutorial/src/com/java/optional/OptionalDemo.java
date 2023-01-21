package com.java.optional;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		
		//demonstrating "of, empty and ofNullable" methods of Optional class
		//empty
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println("empty() method of optional class: "+emptyOptional);
		
		String email2 = "abdullah@gmail.com";
		//of
		Optional<String> ofOptional = Optional.of(email2);
		System.out.println("\nof() method of optional class: "+ofOptional.get());
		
		String email = null;
		
		//ofNullable
		Optional<String> ofNullableOptional = Optional.ofNullable(email);
		System.out.println("\nofNullable() method of optional class: "+ofNullableOptional);
		
		//demonstrating isPresent method
		if(ofNullableOptional.isPresent()) {
			System.out.println("\nisPresent() method: "+ofNullableOptional.get());
		}
		else {
			System.out.println("\nisPresent() method: No value present");
		}
		
		//demonstrating ifPresent method
		Optional<String> gender = Optional.of("Male");
		gender.ifPresent((s) -> System.out.println("\nvalue is present"));
		
		Optional<String> emptyOptional2 = Optional.empty();
		emptyOptional2.ifPresent((s) -> System.out.println("\nvaalue id present"));
		
		//demostration of orElse method
		String defaultOptional = ofNullableOptional.orElse("default@gmail.com");
		System.out.println("\norElse() method: "+defaultOptional);
		
		//demonstration of orElseGet method
		//orElseGet method takes supplier as an argument so we will use lambda expresson
		String defaultOptional2 = ofNullableOptional.orElseGet(() -> "default@gmail.com");
		System.out.println("\norElseGet() method: "+defaultOptional2);
		
		//demonstration of orElseThrow method
//		String optionalObject = ofNullableOptional.orElseThrow(() -> 
//		new IllegalArgumentException("Email does not exist."));
//		System.out.println("\norElseThrow() method: "+optionalObject);
		
		//optional null checks
		// 1. traditional way
		String result = "abcde";
		if(result != null && result.contains("abc")) {
			System.out.println("\nOptional null checks using traditional way: "+result);
		}
		
		// 2. optional filter method
		Optional<String> optionalStr = Optional.of(result);
		optionalStr.filter(res -> res.contains("abc"))
									.ifPresent(res -> 
									System.out.println("Optional null checks using filter: "+res));		
		
		String result1 = " abc ";
		//using map method to remove spaces
		Optional<String> optionalStr1 = Optional.of(result1);
		optionalStr1.filter(res -> res.contains("abc"))
									.map(String::trim)
									.ifPresent(res -> 
									System.out.println("Optional map using filter: "+res));
		
	}

}
