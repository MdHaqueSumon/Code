package com.worlwideexss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class InterView {
	WebDriver driver;
	@Test
	public void TnterViewTest() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","/Users/mdhaque/Downloads/chromedriver");
	    driver = new ChromeDriver();
	    
//		ChromeOptions options = new ChromeOptions ();
//		options.setHeadless(true);
//		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div//input[@class='gLFyf gsfi']")).sendKeys("Automotion");
		
		List<WebElement>alloption=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='sbl1']"));
		
		System.out.println("Total number of Option:"+alloption.size());
		for(int i=0; i<alloption.size();i++) {
			System.out.println(alloption.get(i).getText());
			Thread.sleep(5000);
			if(alloption.get(i).getText().equals("automotion unlimited inc")) {
				alloption.get(i).click();
				break;
			}
		}
		
	
	}

}
 