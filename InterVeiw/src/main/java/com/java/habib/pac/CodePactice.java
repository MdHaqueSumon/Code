package com.java.habib.pac;

public class CodePactice {

	static int n = 2;

	static void retro(int arr[][]) {
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n - 1 - j][i];
				arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
				arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
				arr[j][n - 1 - i] = temp;
			}
		}

	}
	static void print(int a[][]) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++)
				System.out.print(a[i][j]+" ");
				System.out.println();
			}
		
	}
	public static void main(String[] args) {
		int a[][]= {{2,4},{1,5}};
		retro(a);
		print(a);
	}

}		
