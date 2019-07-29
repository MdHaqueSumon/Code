package com.javapactice;

public class StringSplit {

	public static void main(String[] args) {
		String sp = "SMART TECH IT SOLUTION";
		String spl [] = sp.split(" ");
		
		for(String i:spl) {
			//System.out.println(i);
			
		}
		String str="Md Asiful Haque";
		String sp1 []= str.split(" ");
		for(String i:sp1) {
			//System.out.println(i);
		}
		for(int j=sp1.length-1;j>=0;j--) {
			//System.out.println(sp1[j]);
		}
		
		String rv = new StringBuffer(str).reverse().toString();
		System.out.println(rv);

	}

}
