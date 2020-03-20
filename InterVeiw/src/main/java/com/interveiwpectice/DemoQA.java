package com.interveiwpectice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoqa.com");
		driver.findElement(By.xpath("//*[contains(text(),'Automation Practice Switch Windows')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'New Browser Tab')]")).click();
		String pWindow = driver.getWindowHandle();
		System.out.println(pWindow);
		Set<String>allwindow= driver.getWindowHandles();
		for(String child:allwindow) {
			if(!pWindow.equalsIgnoreCase(child)) {
				System.out.println(child);
				driver.switchTo().window(child);
				driver.close();}}
		driver.switchTo().window(pWindow);
		driver.findElement(By.xpath("//*[contains(text(),'IFrame practice page')]")).click();
		//
		driver.switchTo().frame("iframe1");
		Thread.sleep(5000);
		String bodyframe=driver.findElement(By.xpath("//ul[@id='primary-menu']")).getText();
		System.out.println(bodyframe);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe2");
		String childframetext=driver.findElement(By.xpath("//div[@id='content-wrapper']")).getText();
		System.out.println("++++===========================================+++++++++++++");
		System.out.println(childframetext);

	}
	
}
