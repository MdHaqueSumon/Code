package com.javapactice;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		int num, sum=0, temp, r ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter A Number :");
		
		num = input.nextInt();
		temp = num;
		while(temp!=0) {
			r = temp%10;
			sum=sum*10+r;
			temp=temp/10;
			
		}
		System.out.println("ReversInt :"+sum);
		
	}
	
	
}
