package com.java.habib.pac;

import java.util.Random;

public class JavaPacDemo {
	public static void main(String[] args) {
		Random random = new Random();
		int max=100;
		for(int i=0; i<=10; i++) {
			System.out.println(random.nextInt(max));
		}
	}

}
