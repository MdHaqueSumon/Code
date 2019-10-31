package com.javapactice;

public class PalinDromeDemo {
	public static void main(String[] args) {
		String name = "ABCBA";
		String rv = new StringBuffer(name).reverse().toString();
		System.out.println(rv);
		if(rv.equalsIgnoreCase(name)) {
			System.out.println("palindom");
		}else {
			System.out.println("Not");
		}
	}

}
