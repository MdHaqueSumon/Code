package com.interveiwpectice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandels {

	//public static void main(String[] args)
	@Test
	public void testWindow(){
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='popupCloseButton']")).click();
		
		
		String parentwin=driver.getWindowHandle();
		System.out.println(parentwin);
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		
		Set<String>allwindow=driver.getWindowHandles();
		//ArrayList<String> window = new ArrayList<String>(allwindow);
		
		
		
		
		
		
		System.out.println(allwindow);
		
		for(String child:allwindow) {
			if(!parentwin.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("(//*[@class='btn btn-default redBtn'])[2]")).click();
				//driver.close();
				driver.switchTo().activeElement().sendKeys("abc");
				//driver.findElement(By.xpath("//*[@name='fldLoginUserId']")).sendKeys("anbc");
				//driver.switchTo().activeElement().sendKeys("abc");
			}
			
		}
		for(String child2:allwindow) {
			if(!parentwin.equalsIgnoreCase(child2)) {
				driver.switchTo().window(child2);
				driver.switchTo().activeElement().sendKeys("abc");
				//driver.findElement(By.xpath("//*[@name='fldLoginUserId']")).sendKeys("anbc");
			}
			
		}

	}

}
