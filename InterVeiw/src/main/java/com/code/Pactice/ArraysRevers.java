package com.code.Pactice;

import java.util.Arrays;

public class ArraysRevers {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,};
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
