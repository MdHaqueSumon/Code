package com.interveiwpectice;

public class Pac90Degree {
	
	  static int N = 2; 
	  static void rotate90Clockwise(int a[][]) 
	{ 
	  for (int i = 0; i < N / 2; i++) 
	    {
		  for (int j = i; j < N - i - 1; j++) 
	        { 
			  int temp = a[i][j]; 
	            a[i][j] = a[N - 1 - j][i]; 
	            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
	            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
	            a[j][N - 1 - i] = temp; 
	        } 
	    } } 
	       static void printMatrix(int arr[][]) 
	{ 
	    for (int i = 0; i < N; i++) 
	    { 
	        for (int j = 0; j < N; j++) 
	        System.out.print( arr[i][j] + " "); 
	        System.out.println(); 
	    } 
	} 
	public static void main (String[] args)  
	    {
		int arr[][] = { {  2,  4 },{ 1,5} }; 
	    rotate90Clockwise(arr); 
	    printMatrix(arr); 
	    
	    } 
	} 


