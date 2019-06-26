package com.javapactice;

public class ReversWord {

	public static void main(String[] args) {
		
		String st = "This is ";
		
		String a[] = st.split(" ");
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]+" ");
		}

	}

}
