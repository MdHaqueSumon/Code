package com.java.habib.pac;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5};
		int sum=0;
		int sum1=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		for(int i=1;i<=5;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println("Missing Number"+(sum1-sum));

	}

}
