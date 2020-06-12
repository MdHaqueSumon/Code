package com.java.habib.pac;

import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Print number");
		int num =s.nextInt();
		 int rev=0;
		 while(num!=0) {
			 rev=rev*10+num%10;
			 num=num/10;
		 }
		 
		 
//		 StringBuffer sb =new StringBuffer (String.valueOf(num));
//		 StringBuffer rev =sb.reverse();
//		 
		 System.out.println(rev);
		 
		 

	}

}
