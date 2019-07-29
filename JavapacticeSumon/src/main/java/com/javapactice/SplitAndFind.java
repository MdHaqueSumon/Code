package com.javapactice;

public class SplitAndFind {
	public static void main(String[] args) {
		String str ="Smart tech Student";
		
		String[]sp=str.split("");
		for(String i:sp) {
			System.out.println(i);
			
		}
		String a ="10$";
		
	
		
		for(int s=sp.length-1;s>=0;s--) {
			System.out.println("\n"+sp[s]);
		}
			
			
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='t') {
				
				//System.out.println(str.charAt(i)+"::"+count);
				count++;
				
				
			}
		}
		System.out.println("Number Of T :"+count);
		
		String st = "sumon";
		String split [] = st.split(" ");
		for(String i:split) {
			System.out.println(i);
			
		}
		int cout=0;
		for(int j=0; j<st.length();j++) {
			if(st.charAt(j)=='u') {
				cout++;
				
			}
			}
		System.out.println(cout);
	}

}
