package com.tt.nyc;

public class Main  {
	
	public static void main(String[] args) {
		
		
		
		String name ="asiful";
		String lastname =" haque";
		String fullname=name.concat(lastname);
		//System.out.println(fullname);
		
//		String fullname1 = "Md Asiful Haque";
//		String [] namesplit = fullname1.split(" ");
//		for(int i=namesplit.length-1;i>=0;i--) {
//			System.out.println(namesplit[i]);
//		}
			String name2 = "TAP TAP";
			for(int i = name2.length()-1;i>=0; i--) {
				System.out.println(name2.charAt(i));
				
			
			}
			StringBuilder rv = new StringBuilder( name2).reverse();
			System.out.println(rv);
			if(name2.equals(rv)) {
				System.out.println("palandom");
			}else {
				System.out.println("Not");
			}
//			String []s = name2.split(" ");
//			for(int j=s.length-1;j>=0;j--) {
//				System.out.println(s[j]);
//			}
			
			
//			String fristname= "MD Asiful";
//			String lastName = " Haque";
//			String fullName = fristname.concat(lastName);
//			System.out.println(fullName);
//			
//			String [] S = fullName.split(" ");
//			for(int i=S.length-1;i>=0;i--) {
//				System.out.println(S[i]);
//			}
//			for(int j = fullName.length()-1;j>=0; j--) {
//				System.out.print(fullName.charAt(j));
//			}
//		
	}

}
