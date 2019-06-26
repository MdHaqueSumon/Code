package com.javapactice;

import java.util.Scanner;

public class SumOfDegit {
	public static void main(String[] args) {//user enter any number sum of the number
		
		int num, temp , sum=0,r;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter A Number :");
		num = input.nextInt();
		
		temp = num;
		while(temp!=0) {
			r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		System.out.println("Sum Of Digite :"+sum);
		
		
	}

}
