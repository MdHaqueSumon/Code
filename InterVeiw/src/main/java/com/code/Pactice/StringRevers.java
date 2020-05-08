package com.code.Pactice;

public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "United Stated Of America";
		String sp[]=str.split(" ");
		String rev="";
		for(String re:sp) {
			StringBuffer sb = new StringBuffer(re);
			sb.reverse();
			rev=sb.toString()+" ";
			System.out.println(rev);
			
		}
	}

}
