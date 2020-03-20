package com.interveiwpectice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SmartTechYahoo {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Yahoo");
		WebElement option=driver.findElement(By.xpath("//div[@id='header-nav-bar-wrapper']"));
		String print =option.getText();
		System.out.println(print);
		
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("Nutrition");
		driver.findElement(By.xpath("//button[@id='header-desktop-search-button']")).click();
		List<WebElement> img=driver.findElements(By.xpath("//li//img[@class='s-img s-img-ll']"));
		System.out.println("image "+img.size());
		driver.findElement(By.xpath("//div[@id='yucs-profile_text']")).click();
	
		String pWindow = driver.getWindowHandle();
		System.out.println(pWindow);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(4000);
		Set<String>allwindow= driver.getWindowHandles();
		for(String child:allwindow) {
			if(!pWindow.equalsIgnoreCase(child)) {
				System.out.println(child);
				driver.switchTo().window(child);
				driver.close();
				
			}
		}
		driver.switchTo().window(pWindow);
		//driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		//String text=driver.findElement(By.xpath("//p[@id='username-error']")).getText();
		//System.out.println(text);


	}

}
