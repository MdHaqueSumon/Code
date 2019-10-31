package com.comon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comon {
	//private static String URL="https://www.yahoo.com";
	//public static String getURL() {	
		//return URL;}
	private static String URL="https://www.yahoo.com";
	
	public static String getURL() {
		return URL;
	}



	public static  WebDriver getbrowser(String browserName, WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver 2");
		 driver = new ChromeDriver();
		 driver.get(URL);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 
		 return driver;
		
		
		
	
		
		
	}

}
