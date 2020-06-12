package com.java.habib.pac;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Put A Number ");
		int num = s.nextInt();
		int count=0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime Number");
		}else {
			System.out.println("Not A Prime Number");
		}

	}

}
