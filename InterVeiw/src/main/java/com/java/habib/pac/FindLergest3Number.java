package com.java.habib.pac;

public class FindLergest3Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =1100;
		int num2=200;
		int num3=330;
		if(num>num2&&num>num3) {
			System.out.println("Lergest Number "+ num);
			
		}else if (num2>num&&num2>num3) {
			System.out.println("Lergest Number "+num2);
		}else {
			System.out.println("Lergest Number "+ num3);
		}
		

	}

}
