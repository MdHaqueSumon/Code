package com.code.Pactice;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=0; i<=100; i++) {
		if(i%3==0 && i%5==0) {
			System.out.println("FizzBuzz"+i);
		}
		if(i%3==0) {
			System.out.println("Fizz"+i);
		}
		if(i%5==0) {
			System.out.println("Buzz"+i);
			
		}
	}

	}

}
