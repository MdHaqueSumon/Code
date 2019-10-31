package com.javapactice;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<=500; i++) {
//			System.out.println("sumon");
//			
//		}
		String name ="Sumon";
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.println(name.charAt(i));
		}
		for(int i=100;i<=300;i++) {
			if(String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
		}

	

}}
