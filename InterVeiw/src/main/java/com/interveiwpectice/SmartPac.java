package com.interveiwpectice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SmartPac {
	@Test

	public  void  logIn ()throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Gmail')]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),' Sign in')])[2]")).click();
		String pWindow = driver.getWindowHandle();
		System.out.println(pWindow);
		Set<String>allwindow= driver.getWindowHandles();
		for(String child:allwindow) {
			if(!pWindow.equalsIgnoreCase(child)) {
				System.out.println(child);
				driver.switchTo().window(child);}}
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mdahaque4@gmail.com");
//		//WebDriverWait wait = new WebDriverWait(driver,30);
//		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='identifierNext']")))).click();
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.name("password")).sendKeys("Sumon0680");
//		
//		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
//		Thread.sleep(5000);
//		WebElement inbox=driver.findElement(By.xpath("//div[@id=':ll']"));
//		String inboxValue=inbox.getText();
//		System.out.println(inboxValue);

	}

}
