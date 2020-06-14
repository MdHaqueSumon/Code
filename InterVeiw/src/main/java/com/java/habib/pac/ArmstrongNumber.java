package com.java.habib.pac;

public class ArmstrongNumber {
	
	public static boolean check(int input) {
        int temp, digit, sumOfPower = 0;
        temp = input;
        int digits = countDigit(input);
        while (temp != 0) {
            digit = temp % 10;
            System.out.println("Current Digit is " + digit);
            sumOfPower = sumOfPower + (int) Math.pow(digit, digits);
            System.out.println("Current sumOfPower is " + sumOfPower);
            temp /= 10;
        }
        return sumOfPower == input;
    }

    static int countDigit(long n) {
        return (int) Math.floor(Math.log10(n) + 1);
        
    }
    
    public static void main(String[] args) {
    	int input=153;
		check(input);
	}
}


