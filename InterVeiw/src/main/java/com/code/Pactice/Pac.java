package com.code.Pactice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Pac {
	
	public static void main(String[] args) {
		String str= "abcabc";
		
		Set <Character>hs= new HashSet<>();
		for(int i=0; i<str.length();i++) {
			hs.add(str.charAt(i));
			
		}
		for(Character ch:hs) {
			System.out.print(ch.toString());
		}
	}

	
}
