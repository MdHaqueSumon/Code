package com.code.Pactice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortArray {

	public static void main(String[] args) {
//		int arr[] = { 4, 3, 6, 2, 5 };
//		System.out.println("Before Shorting Array " + Arrays.toString(arr));
//		Arrays.sort(arr);
//		
//		System.out.println("After Shorting Array " + Arrays.toString(arr));
		
		Integer arr[] = { 4, 3, 6, 2, 5 };
		System.out.println("Before Shorting Array " + Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("After Shorting Array " + Arrays.toString(arr));
		

	}

}
