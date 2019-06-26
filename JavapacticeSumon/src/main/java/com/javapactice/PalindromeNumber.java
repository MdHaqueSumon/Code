package com.javapactice;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		int num, sum=0, temp, r;
		System.out.println("Enter A Number :");
		num=input.nextInt();
		temp = num;
		while(temp!=0) {
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
			
		}
		if(num==sum) {
			System.out.println("Palindom Number :");
		}else {
			System.out.println("Not A Palindom Number :");
		}
		
		
	
		
		
	}

}
