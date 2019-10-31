package com.javapactice;

public class FibonacciNumber {
	public static void main(String[] args) {
		int frist = 0, second = 1, fibo;
		System.out.println("Fibonacci Number :"+frist);
		//System.out.println("Fibonacci Number :"+second);
		for(int i=2;i<=10;i++) {
			fibo = frist+second;
			System.out.println("Fibonacci Number :"+fibo);
			frist = second;
			second = fibo;
			
		}
		
		
	}

}
