package com.java.habib.pac;

public class StringWhiteSpece {

	public static void main(String[] args) {
		String str =" aa bb cc dd ";
		String st =str.replaceAll("\\s","");
		System.out.println(st);

	}

}
