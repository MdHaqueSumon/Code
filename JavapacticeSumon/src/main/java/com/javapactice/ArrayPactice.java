package com.javapactice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayPactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]b= {10,20,30,40,50,60,};
		int sum=0;
		for(int i:b) {
			System.out.println(i);
			sum=sum+i;
			
		}
		System.out.println(sum);
		
		//List==ArrayList,LinckedList,vactor,stack
		//set==hashSet,linckedhashset,treeset
		//map==hashmap,lickedhashmap,treemap,hashmaptable.
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
	
		System.out.println(list);
		for(int i:list) {
			System.out.println(i);
			
		}
				
		
		
		List<Integer> linklist= new LinkedList<Integer>();
		List<Integer> vector= new Vector<Integer>();
		List<Integer> stack= new Stack<Integer>();
		
		Integer [] arrayToSort = new Integer[] {10,3,56,87,42,5};
		System.out.print("General Order is = ");
		for(Integer i : arrayToSort) {
			System.out.print(i.intValue() + " ");
		}
		Arrays.sort(arrayToSort);
		System.out.print("\n\n Accending order=");
		for(Integer i:arrayToSort) {
			System.out.print(i.intValue()+" ");
		}

	

}}
