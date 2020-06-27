package com.interveiwpectice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0; i<linklist.size(); i++) {
			System.out.println(linklist.get(i).getText());
			
			Actions action =new  Actions(driver);
			action.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		}
		
	
		

	}

}
