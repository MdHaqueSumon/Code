package com.javapactice;

import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
//		int num, sum=0, temp, r ;
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter A Number :");
//		
//		num = input.nextInt();
//		temp = num;
//		while(temp!=0) {
//			r = temp%10;
//			sum=sum*10+r;
//			temp=temp/10;
//			
//		}
//		System.out.println("ReversInt :"+sum);
//		
		int number=1234 , sumt=0, tem, rv;
		tem=number;
		while(tem!=0) {
			rv=tem%10;
			sumt=sumt*10+rv;
			tem=tem/10;
			
		}
		System.out.println(sumt);
		
	}
	
	
}
