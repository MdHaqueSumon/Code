package com.code.Pactice;

import java.util.HashSet;
import java.util.Set;

public class ArraysRemoveDublicate {

	public static void main(String[] args) {
		int [] num = {20,30,40,50,60,70,80,90,30,40,};
		int len =num.length;
		Set <Integer>set=new HashSet<Integer>();
		for(int i=0; i<len; i++) {
			set.add(num[i]);
			
			}
		System.out.println(set);
		}
	}


