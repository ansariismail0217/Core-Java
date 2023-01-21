package com.java.lambda;

interface Addable{
	int addition(int a, int b);
}

//tradidtional way
class AddableImpl implements Addable{

	@Override
	public int addition(int a, int b) {
		return (a+b);
	}
	
}

public class LambdaParameters {
	
	public static void main(String[] args) {
		
		Addable additionVar = (a, b) -> a+b;
		int res = additionVar.addition(10, 20);
		
		System.out.println(res);
		
		//lambda expressions with multiple statements in the body
		Addable additionVar2 = (a, b) -> {
			int c = a+b;
			return c;
		};
		int res2 = additionVar2.addition(20, 30);
		System.out.println(res2);
		
	}

}
