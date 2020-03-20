package com.interveiwpectice;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =new String("USA$&@NY()[] {}123");
		String rep = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(rep);
		
		String rep1 = name.replaceAll("\\w", "");//remove special character 
		System.out.println(rep1);
		String rep2 = name.replaceAll("\\d", "");//remove only number
		System.out.println(rep2);
		String rep3 = name.replaceAll("\\D", "");//remove special character and latter
		System.out.println(rep3);
		String rep4 = name.replaceAll("[A-z]", "");//remove all later
		System.out.println(rep4);
	
		
		// "\\W" Remove Special character
		// "\\d" Remove Only Number
		// "\\D" Remove Special character and latter
		// "[A-z]" Remove all Latter

	}

}
