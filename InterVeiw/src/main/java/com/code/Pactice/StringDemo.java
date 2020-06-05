package com.code.Pactice;

public class StringDemo {

	public static void main(String[] args) {
		String str = "AA CCB CCC DD AAAA CC BB DD";
		String sp[]= str.split(" ");
		int count=0;
		for(int i=0; i<sp.length; i++) {
			System.out.println(sp[i]);
			if(sp[i].contains("AA")) 
				count++;
			
			}
		System.out.println("COUNT :"+count);
		if(count>1) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Faild");
		}

	}

}
