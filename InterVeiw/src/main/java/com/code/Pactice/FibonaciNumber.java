package com.code.Pactice;

public class FibonaciNumber {

	public static void main(String[] args) {
		int first =0, second=1, febo=0;
		for(int i=0; i<=10; i++) {
			febo=first+second;
			System.out.println(febo);
			first = second;
			second = febo;
			
		}

	}

}
