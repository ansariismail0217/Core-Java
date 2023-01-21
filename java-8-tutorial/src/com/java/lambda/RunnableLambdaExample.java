package com.java.lambda;

import java.util.function.Function;

//traditional way
class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("run method called...");
	}
	
}

public class RunnableLambdaExample {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		//using lambda expression
		Thread threadLambda = new Thread(() -> System.out.println("run method called using lambda..."));
		threadLambda.start();
		
		//commonly used built in functional Interaface
		Function<String, Integer> fun = (String s) -> s.length();
		System.out.println("Length: "+fun.apply("Abdullah"));
	}

}
