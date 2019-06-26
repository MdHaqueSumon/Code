package com.javapactice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLoop {
	public static void main(String[] args) {
		
		List<Integer> job = new ArrayList<>();
		job.add(10);
		job.add(20);
		job.add(30);
		job.add(40);
		job.add(50);
		job.add(60);
		job.add(70);
		job.add(80);
		job.add(90);
//		for(int i=0; i<job.size(); i++) {
//			System.out.println(job.get(i));
//		}
//		
//		for(int i:job) {
//		System.out.println(i);
//			}
//		job.forEach(each->
//		System.out.println(each));
//		job.forEach(each->{
//			System.out.println(each);
//			
//		});
//		
		job.forEach(System.out::println);
		
		int maxValu = Collections.max(job);
		System.out.println("MAX VALUE :" +maxValu);
		int minValu = Collections.min(job);
		System.out.println("MINIMUM VALUE :" +minValu);
		job.remove(job.indexOf(maxValu));
		System.out.println(job);
		int ScondMaxValue = Collections.max(job);
		System.out.println("Scond Max Valu :"+ScondMaxValue);
		
		 Collections.reverse(job);
		 for(int i:job) {
			 System.out.println(i);
				
			 
		 }
		
		
		
		
	}
		

}
