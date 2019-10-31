package com.javapactice;

public class paceFutu {
	public static void main(String[] args) {
		String name = "United State Of America";
		String []st= name.split(" ");
//		for(int i=0; i<st.length;i++) {
//			System.out.println(st[i]);
//			
//		}
//		
//		
//		for(int i= name.length()-1;i>=0; i--) {
//			System.out.print(name.charAt(i));
//		}
//		 for(String j:st) {
//			 System.out.println(j);
//		 }
//		
		for(int i=st.length-1;i>=0;i--) {
			System.out.println(st[i]);
		}
	}
	
	
	

}
