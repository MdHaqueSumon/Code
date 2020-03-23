package com.interveiwpectice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaypalDemo {
	WebDriver driver;
	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Test
	public void LogIN() {
		driver.get("https://www.paypal.com");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Send Money, Pay Online or Set Up a Merchant Account - PayPal");
		driver.findElement(By.xpath("(//a[text()='Sign Up for Free'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='paypalAccountData_email']")).sendKeys("test@google.com");
		driver.findElement(By.xpath("//input[@id='paypalAccountData_password']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@id='paypalAccountData_confirmPassword']")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id='/appData/action']")).click();
		String error=driver.findElement(By.xpath("//span[@id='paypalAccountData_email_helptext']")).getText();
		System.out.println(error);
		Assert.assertTrue(true, "It looks like you already signed up. Log in to your account");
		String confirmText = driver.findElement(By.xpath("//*[text()='Confirm your password']")).getText();
		System.out.println(confirmText);
		List<WebElement> image =driver.findElements(By.tagName("img"));
		int imageCount = image.size();
		System.out.println("Number Of Image :"+imageCount);
		String flag=driver.findElement(By.xpath("//*[@class='country US']")).getText();
		System.out.println(flag);
		
		
	}
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
