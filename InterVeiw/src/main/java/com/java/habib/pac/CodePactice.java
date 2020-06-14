package com.java.habib.pac;

import java.util.Scanner;

public class CodePactice {

	public static void main(String[] args) {
		int count=0;

		for(int i=0; i<=100; i++) {
			for(int j=2; j<i-1; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println("prime"+i);
			}else {
				System.out.println("Not"+i);
				count=0;
			}
		}
		

	}

}
