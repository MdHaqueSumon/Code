package com.java.habib.pac;

public class SurchAnArrayElement {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		int surch=50;
		boolean flag=false;
		for(int i=0;i<arr.length; i++) {
			if(surch==arr[i]) {
				System.out.println("Found Element :"+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Eliment not found");
		}
		

	}

}
