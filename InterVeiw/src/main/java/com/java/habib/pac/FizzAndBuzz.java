package com.java.habib.pac;

public class FizzAndBuzz {

	public static void main(String[] args) {
		

			for (int i = 0; i < 100; i++) {

				if (i % 3 == 0 & i%5==0)
					System.out.println("FizzBazz::" + i);
				else if(i % 3 == 0) {
					System.out.println("Fizz::" + i);
				}else if(i % 5 == 0) {
					System.out.println("Bazz::" + i);
				}else {
					System.out.println("Not a fizzbazz number::"+i);
				}
			}
		}

	}


