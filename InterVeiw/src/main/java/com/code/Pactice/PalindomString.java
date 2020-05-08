package com.code.Pactice;

public class PalindomString {

	public static void main(String[] args) {
		String str = "MOM";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
			System.out.println("palindom");
		else
			System.out.println("not palindom");
	}

}
