package com.code.Pactice;

public class StringSplitRevers {
	public static void main(String[] args) {
		String str = "United State Of America";
		String sp[]= str.split(" ");
		for(int i=sp.length-1; i>=0; i--)
			System.out.println(sp[i]);
	}
		

}
