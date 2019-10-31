package com.dropdwon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.screenshot.ScreenShot;

public class DropDwon {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		Select select=new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
		select.selectByVisibleText("Books");
		//ScreenShot.ss(driver, "sumon");
		ScreenShot.ss(driver, "sumon2");
		

	}

}
