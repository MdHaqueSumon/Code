package com.javapactice;

public class PrimeNumber {

	public static void main(String[] args) {
		int m = 3, n=100, count = 0, totalprime=0;
				
				for(int i=m; i<=n; i++) {
					for(int j=2;j<=i-1;j++) {
						if(i%j==0) {
							count++;
							break;
						}
					}
					if(count==0) {
						System.out.println(i);
						totalprime++;
					}
					count=0;
					
				}
				System.out.println("Total Prime Number :"+totalprime);

	}

}
