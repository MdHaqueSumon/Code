package com.java.habib.pac;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
//		Scanner s = new Scanner (System.in);
//		System.out.println("Put a tring Valu");
		String str = "HABIB";
		String rev=" ";
		for(int i=str.length()-1; i>=0; i--) {
			//System.out.print(str.charAt(i));
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palin Dom");
		}else {
			System.out.println("Not A palindom");
		}
	}

}
