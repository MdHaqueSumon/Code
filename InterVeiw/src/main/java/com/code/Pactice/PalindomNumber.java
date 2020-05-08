package com.code.Pactice;

public class PalindomNumber {

	public static void main(String[] args) {
		int num =545;
		int r, temp, sum=0;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("palindom");
		else
			System.out.println("Not Palindom");
	}

}
