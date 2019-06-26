package com.javapactice;

public class PalindromeString {

	public static void main(String[] args) {
		String st = new String("Level");
		String rv  = new StringBuffer(st).reverse().toString();
		if(st.equalsIgnoreCase(rv)) {
			System.out.println("a");
		}
		else {
			System.out.println("b");
		}
		
//		String st = "Level";
//		
//		StringBuffer rv = new StringBuffer(st);
//		
//		rv.reverse();
//		
//		//String rv = new StringBuffer(st).reverse().toString();
//		if(st.equalsIgnoreCase(rv.toString())) {
//			System.out.println("Palindrom String");
//		}else
//		{
//			System.out.println("Not Palindom String");
//		}
//
//	}

}}
