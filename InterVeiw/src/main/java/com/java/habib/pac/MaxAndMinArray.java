package com.java.habib.pac;

public class MaxAndMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		
		int max=arr[0];
		for(int i=1;i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max Element "+max);
		
		int min =arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum Valu "+min);

	}

}
