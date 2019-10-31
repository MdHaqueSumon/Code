package com.javapactice;

import java.util.ArrayList;
import java.util.Collections;

public class Pactice {
	
	public static void main(String[] args) {
		ArrayList <Integer>list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Integer maxValue=  Collections.max(list);
		System.out.println(maxValue);
		list.remove(maxValue);
		Integer max=Collections.max(list);
		System.out.println(max);
		Integer min = Collections.min(list);
		System.out.println(min);
		list.remove(min);
		Integer secondmin = Collections.min(list);
		System.out.println(secondmin);
		
		

	}
}
