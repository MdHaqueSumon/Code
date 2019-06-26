package com.javapactice;

import java.util.Arrays;
import java.util.Collections;



public class ArraySortTest {
	
	public void sortIntArray() {
		Integer [] arrayToSort = new Integer[] {10,3,56,87,42,5};
		System.out.print("General Order is = ");
		
		for(Integer i : arrayToSort) {
			System.out.print(i.intValue() + " ");
		}
		Arrays.sort(arrayToSort);
		System.out.print("\n\nAscending Order is = ");
		for(Integer i : arrayToSort) {
			System.out.print(i.intValue() + " ");
		}
		Arrays.sort(arrayToSort, Collections.reverseOrder());
		System.out.print(" \n\nDescinding Order is = " );
		for (Integer i :arrayToSort ) {
			System.out.print(i.intValue() + " ");
		}
		
	}
	public static void main(String[] args) {
		ArraySortTest  aST = new ArraySortTest ();
		aST.sortIntArray();
		
		
	}

}
