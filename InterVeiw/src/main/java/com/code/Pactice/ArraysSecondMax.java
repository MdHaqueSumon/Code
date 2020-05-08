package com.code.Pactice;

public class ArraysSecondMax {

	public static void main(String[] args) {
		int arr[]= {20,30,40,50,60,80,};
		int max=arr[0], secondmax=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}else if(arr[i]>secondmax) {
				
				secondmax=arr[i];
			}
		}
		
		System.out.println(secondmax);
	}

}
