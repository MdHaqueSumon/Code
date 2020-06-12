package com.java.habib.pac;

import java.util.Scanner;

public class PalingdomString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Put A Name");
		String str = s.nextLine();
		String rev="";
		
		for(int i =str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindom");
		}
		else {
			System.out.println("Not Palin Dom");
		}

	}

}
