package com.code.Pactice;

public class PrimeNumberTow {

	public static void main(String[] args) {
		int count=0;
		for(int i=0; i<=100;i++) {
			for(int j=2; j<i-1; j++) {
				if(i%j==0) {
					count++;
					break;
					
				}
			}
		
		if(count==0) 
			System.out.println("Prime Number"+i);
		else
			System.out.println("Not Prime Number"+i);
		count=0;
			
		}

	}

}
