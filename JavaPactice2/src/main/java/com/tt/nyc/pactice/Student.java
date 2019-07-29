package com.tt.nyc.pactice;

public class Student {
	
	String name;
	int phone;
	int age;

	
	Student(){
		System.out.println("this is constator");
	}
	Student(String n, int a){
		name=n;
		age=a;

		
	}
	
	Student(String n,int a, int p){
		name=n;
		age=a;
		phone=p;
	}
		void display() {
			System.out.println("Person name is ;:"+name);
			System.out.println("Person age is ;:"+age);
			System.out.println("Person phone is ;:"+phone);
			System.out.println("\n");
			
	
	


}}
