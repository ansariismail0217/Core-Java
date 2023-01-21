//lambda expression is an example of functional programming

package com.java.lambda;

interface Shape{
	void draw();
}

//class Rectangle implements Shape{
//
//	@Override
//	public void draw() {
//		System.out.println("Draw a shape of rectangle!");
//	}
//	
//}
//
//class Square implements Shape{
//
//	@Override
//	public void draw() {
//		System.out.println("Draw a shape of square!");
//	}
//	
//}

public class LambdaExample {
	public static void main(String[] args) {
		
		System.out.println("Using lambda expressions:");
		
		//converting the above codes into lamda expression
		Shape rectangle = () -> System.out.println("Draw a shape of rectangle!");
		rectangle.draw();
		
		Shape square = () -> System.out.println("Draw a shape of square!");
		square.draw();
		
//		Shape circle = () -> System.out.println("Draw a shape of circle!");
//		circle.draw();
		
		System.out.println("\nUsing lambda expression as a method parameter:");
		print(rectangle);
		print(square);
		
		//we can also define lambda expression as a method parameter
		//let's take an exaple of a circle
		//we are passing lambda exression as a behavior to the method parameter
		print(() -> System.out.println("Draw a shape of circle!"));
		
	}
	
	private static void print(Shape shape) {
		shape.draw();
	}
}
