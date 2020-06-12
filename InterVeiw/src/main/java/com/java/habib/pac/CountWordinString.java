package com.java.habib.pac;

public class CountWordinString {

	public static void main(String[] args) {
		String str="United State Of America";
		int count=0;
		for(int i=0; i<str.length();i++) {
			System.out.println(str.charAt(i));
			if(str.charAt(i)=='e') {
				count++;
			}
		} System.out.println("Number of e :"+count);

	}

}
