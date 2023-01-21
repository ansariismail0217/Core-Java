package com.java.lambda;

import java.time.LocalDateTime;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

//class FunctionImpl implements Function<String, Integer>{
//
//	@Override
//	public Integer apply(String t) {
//		return t.length();
//	}
//	
//}

//class ConsumerImpl implements Consumer<String>{
//
//	@Override
//	public void accept(String t) {
//		System.out.println(t);
//	}
//}

//class SupplierImpl implements Supplier<LocalDateTime>{
//
//	@Override
//	public LocalDateTime get() {
//		return LocalDateTime.now();
//	}
//	
//}

public class BuiltInFunctionalInterfaces {
	public static void main(String[] args) {
		
		Function<String, Integer> function = (String s) -> s.length();
		System.out.println("Length: "+function.apply("Abdullah"));
		
//		Consumer<String> consumer = new ConsumerImpl();
//		consumer.accept("Merhaba ya akhi...!");
		
		Consumer<String> consumer = (String t) -> System.out.println("\n"+t);
		consumer.accept("Merhaba ya akhi...!");
		
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println("\n"+supplier.get());
		
		//bifunction example
		System.out.println("\nBifunction example: ");
		BiFunction<Integer, Integer, Integer> addition = (t,u) -> t+u;
		BiFunction<Integer, Integer, Integer> subtraction = (t,u) -> t-u;
		
		System.out.println(addition.apply(25, 10));
		System.out.println(subtraction.apply(25, 10));
		
		//nested functional interfaes
		System.out.println("\nNested functional interfaes");
		Function<Integer, Integer> square = (i) -> i*i;
		Integer nested = addition.andThen(square).apply(10, 5);
		System.out.println(nested);
		
		
	}

}
