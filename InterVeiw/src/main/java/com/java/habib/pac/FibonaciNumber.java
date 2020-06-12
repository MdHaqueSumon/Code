package com.java.habib.pac;

public class FibonaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first =0 , second=1 , fibo=0;
		for(int i=0; i<=10; i++) {
			fibo=first+second;
			System.out.println(fibo);
			first=second;
			second=fibo;
		}

	}

}
