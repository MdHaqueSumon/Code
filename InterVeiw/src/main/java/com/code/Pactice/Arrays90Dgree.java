package com.code.Pactice;

public class Arrays90Dgree {
	
	public static int n=2;
	public static void retro(int a[][]) {
		for(int i=0; i<n/2; i++) {
			for(int j=i; j<n-i-1; j++) {
				int temp=a[i][j];
				a[i][j]=a[n-1-j][i];
				a[n-1-j][i]=a[n-1-i][n-1-j];
				a[n-1-i][n-1-j]= a[j][n-1-i];
				a[j][n-1-i]=temp;
				
			}
		}
	}
	public static void print(int arr[][]) {
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int arr [][]= {{1,5},{2,4}};
		retro(arr);
		print(arr);
		

	}

}
