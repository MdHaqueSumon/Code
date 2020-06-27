package com.code.Pactice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormet {

	public static void main(String[] args) {
//		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//		   LocalDateTime now = LocalDateTime.now();  
//		   System.out.println(dtf.format(now));
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime now= LocalDateTime.now();
		//System.out.println(dtf.format(now));
		
		DateTimeFormatter dt= DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime n= LocalDateTime.now();
		System.out.println(dt.format(n));

		
	}

}
