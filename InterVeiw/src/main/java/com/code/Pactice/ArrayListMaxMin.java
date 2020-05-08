package com.code.Pactice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Integer maxValue=Collections.max(list);
		System.out.println(maxValue);
		list.remove(maxValue);
		Integer secondmax = Collections.max(list);
		System.out.println(secondmax);
		Integer min = Collections.min(list);
		System.out.println(min);
		

	}

}
