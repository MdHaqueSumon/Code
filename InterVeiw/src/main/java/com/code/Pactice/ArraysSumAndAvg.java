package com.code.Pactice;

public class ArraysSumAndAvg {

	public static void main(String[] args) {
		int arr []= {20,30,40,50,60,70};
		int sum=0;double avg=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			avg=sum/arr.length;
			
		}
		System.out.println(avg);
		System.out.println(sum);

	}

}
