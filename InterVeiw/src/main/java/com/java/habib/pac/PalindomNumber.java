package com.java.habib.pac;

import java.util.Scanner;

public class PalindomNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("put a number ");
		int num =s.nextInt();
		int orgNum=num ;
		int rev = 0;
		
		while(num!=0) {
			rev= rev*10+num%10;
			num=num/10;
			
			}
		if(orgNum==rev) {
			System.out.println("palindom");
		}
		else {
			System.out.println("Not palindom");
		}

	}

}
