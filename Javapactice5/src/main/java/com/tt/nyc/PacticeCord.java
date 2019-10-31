package com.tt.nyc;

public class PacticeCord {

	public static void main(String[] args) {
		String name = "saifa irin";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='i') {
				System.out.println(name.charAt(i));
				count++;
			}
		}System.out.println(+count);
	}

}
