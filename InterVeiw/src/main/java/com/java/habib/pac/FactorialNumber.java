package com.java.habib.pac;

public class FactorialNumber {

	public static void main(String[] args) {
		int num=5;long fac=1;
//		for(int i=0; i<num;i++) {
//			fac=fac*i;
//		}
		for(int i=num; i>0;i--) {
			fac=fac*i;
		}
		System.out.println(fac);

	}

}
