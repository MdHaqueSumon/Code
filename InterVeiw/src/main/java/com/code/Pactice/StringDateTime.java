package com.code.Pactice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringDateTime {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

	}

}//Calendar c = Calendar.getInstance();
//System.out.println("Current Date and Time :"); 
//System.out.format("%tB %te, %tY%n", c, c, c);
//System.out.format("%tl:%tM %tp%n", c, c, c); 
