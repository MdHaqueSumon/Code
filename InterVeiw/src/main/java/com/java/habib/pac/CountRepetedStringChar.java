package com.java.habib.pac;

public class CountRepetedStringChar {

	public static void main(String[] args) {
		String str ="Java c++ java";
		int total = str.length();
		int afterremove = str.replaceAll("a","").length();
		int count = total-afterremove;
		System.out.println(count);

	}

}
