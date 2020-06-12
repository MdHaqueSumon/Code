package com.code.Pactice;

import java.util.Arrays;

public class SortingElementinArray {

	public static void main(String[] args) {
		// Bauble Short
		int arr[] = { 4, 3, 6, 2, 5 };
		System.out.println("Before Shorting Array" + Arrays.toString(arr));
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After Shoting Array " + Arrays.toString(arr));

	}

}
