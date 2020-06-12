package com.java.habib.pac;

public class ReversEachWordInString {

	public static void main(String[] args) {
		String str = "United State Of America";
		// Output=aciremA fO etatS detinU
		String sp[] = str.split(" ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
		}
//		String str="Welcome to Java and selenium";
		//Output= emocleW ot avaJ dna muineles 
//		
//		String[]words=str.split(" ");
//		
//		
//		String reverseString="";
//		
//		for(String w:words) {
//			
//			
//			
//			String reverseword="";
//			
//			for(int i=w.length()-1; i>=0; i--) {
//				reverseword=reverseword+w.charAt(i);
//			}
//			
//			
//			reverseString=reverseString+reverseword+" ";
//		}
//		
//		
//		System.out.println(reverseString);

	}

}
