package com.javapactice;

import java.util.Arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {
		
		int [] a = {10,3,56,87,42,5};
		
		Arrays.sort(a);
		System.out.println("Minimum Number =" +a[0]);
		System.out.println("Maximum Number =" +a[a.length-3]);
		System.out.println("");
		String abc = "sumon";
		for(int i=abc.length()-1;i>=0;i--) {
			System.out.print(abc.charAt(i));
		}
		
		int[]num= {1,2,3,4};
		int sum =0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
			
		}
		System.out.println(+sum);
	}

}
